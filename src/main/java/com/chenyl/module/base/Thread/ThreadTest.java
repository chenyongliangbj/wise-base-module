package com.chenyl.module.base.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {

    private static class UseThread extends Thread{
        @Override
        public void run(){
            super.run();
            System.out.println(Thread.currentThread().getName()+" am extends Thread");
        }
    }

    private static class UseRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" implements Runnable");
        }
    }

    private static class UseCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println(Thread.currentThread().getName()+" implements Callable");
            return "CallResult";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        UseThread useThread = new UseThread();
        useThread.start();

        UseRunnable useRunnable = new UseRunnable();
        new Thread(useRunnable).start();

        UseCallable useCallable = new UseCallable();
        FutureTask<String> futureTask = new FutureTask<>(useCallable);
        new Thread(futureTask).start();
        System.out.println("Get UseCallable result:"+futureTask.get());
    }
}
