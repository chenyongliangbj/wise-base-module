package com.chenyl.module.base.Thread.base;

import java.util.concurrent.ExecutionException;

/**
 * 守护线程
 *
 *
  **/
public class D_DaemonThread {


    /**
     * 实现接口Runnable
     */
    private static class UseRunnable implements Runnable{

        @Override
        public void run() {
            try{
                int a =2;
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("finally");
            }
            while(true){
                System.out.println(Thread.currentThread().getName()+" implements Runnable");
            }

        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //守护线程
        UseRunnable useRunnable = new UseRunnable();
        Thread thread = new Thread(useRunnable);
        thread.setDaemon(true);

        thread.start();

        Thread.sleep(1000);

    }

}
