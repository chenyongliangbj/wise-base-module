package com.chenyl.module.base.Thread.base;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程二种启动方式
 * 1. 继承类Thread
 * 2. 实现接口Runnable
 *
 *
 * 实现接口Callable
 */
public class B_NewThread {

    /**
      * 继承类Thread
     */
    private static class UseThread extends Thread{
        @Override
        public void run(){
            super.run();
            System.out.println(Thread.currentThread().getName()+" am extends Thread");
        }
    }

    /**
     * 实现接口Runnable
     */
    private static class UseRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" implements Runnable");
        }
    }
    /**
     * 实现接口Callable
     */
    private static class UseCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println(Thread.currentThread().getName()+" implements Callable");
            return "CallResult";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        UseThread useThread = new UseThread();
//        useThread.start();
        useThread.start();
//        useThread.run();
//        useThread.run();//run()可以多次调用

        //Thread类是Java里对线程概念的抽象，可以这样理解：我们通过new Thread()其实只是new出一个Thread的实例，
        // 还没有操作系统中真正的线程挂起钩来。只有执行了start()方法后，才实现了真正意义上的启动线程。
        //start()方法让一个线程进入就绪队列等待分配cpu，分到cpu后才调用实现的run()方法，start()方法不能重复调用，如果重复调用会抛出异常。
        //而run方法是业务逻辑实现的地方，本质上和任意一个类的任意一个成员方法并没有任何区别，可以重复执行，也可以被单独调用。

        UseRunnable useRunnable = new UseRunnable();
        new Thread(useRunnable).start();

        UseCallable useCallable = new UseCallable();
        FutureTask<String> futureTask = new FutureTask<>(useCallable);
        new Thread(futureTask).start();
        System.out.println("Get UseCallable result:"+futureTask.get());

    }
}
