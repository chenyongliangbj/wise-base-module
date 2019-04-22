package com.chenyl.module.base.Thread;

import java.util.concurrent.ExecutionException;

/**
 * 线程的停止方式
 *
 * public void Thread.interrupt()        //中断线程
 * public boolean Thread.isInterrupted() //判断线程是否中断
 * public static boolean Thread.interrupted() //判断是否被中断，并清除当前中断状态
 *
 *
 * 优雅的中断：interrupt()
 *
 * 线程通过方法isInterrupted()来进行判断是否被中断，
 * 也可以调用静态方法Thread.interrupted()来进行判断当前线程是否被中断，
 * 不过Thread.interrupted()会同时将中断标识位改写为false。
 *
 * isInterrupted()      => isInterrupted() == true
 * Thread.interrupted() => isInterrupted() == false
 */
public class ThreadTest2 {

    /**
      * 继承类Thread
     */
    private static class UseThread extends Thread{
        @Override
        public void run(){
            super.run();
            while(true){
                System.out.println(Thread.currentThread().getName()+" am extends Thread isInterrupted："+isInterrupted());

               /* if(isInterrupted()){
                    System.out.println(Thread.currentThread().getName()+" isInterrupted："+isInterrupted());
                    break;
                }*/
                if(Thread.interrupted()){
                    System.out.println(Thread.currentThread().getName()+" isInterrupted："+isInterrupted());
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        UseThread useThread = new UseThread();
        useThread.start();

        Thread.sleep(4000);
        useThread.interrupt();
        //useThread.stop(); //不建议使用



    }
}
