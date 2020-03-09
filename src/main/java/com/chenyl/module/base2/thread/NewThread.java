package com.chenyl.module.base2.thread;

import java.util.concurrent.Callable;

public class NewThread {


    private static class UseRun implements Runnable{

        @Override
        public void run() {
            System.out.println("线程启动,Im a Runnable");
        }
    }


    private static class UseThread extends Thread{

        @Override
        public void run(){
            System.out.println("线程启动,Im a Thread");
        }
    }

    private static class UseCallBack implements Callable{

        @Override
        public Object call() throws Exception {
            System.out.println("线程启动，Im a callable");
            return "abc";
        }
    }

    public static void main(String[] args) throws Exception {

        UseRun useRun = new UseRun();
        useRun.run();

        UseThread useThread = new UseThread();
        useThread.run();

        UseCallBack useCallBack = new UseCallBack();
        System.out.println(useCallBack.call());
    }
}
