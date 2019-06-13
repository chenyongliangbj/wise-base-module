package com.chenyl.module.base.Thread.base;

/**
 * 测试interrupt()
 *
 * 1.使用interrupt()导致sleep/wait/join抛出InterruptedException异常，
 *   自动的将是否请求中断标志置为了false
 *   因此需要在捕获异常的时候重新将中断标志置为true
 *   Thread.currentThread().interrupt();
 *
 **/
public class G_Interrupt2SleepWaitJoin {


    private static class UseThread extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //线程中断的时候sleep会抛出异常，并自动的将是否请求中断标志置为了false
                e.printStackTrace();
                Thread.currentThread().interrupt();//如果要进行中断操作，必须重新interrupt
            }
            while(true){
                System.out.println(Thread.currentThread().getName()+" am extends Thread isInterrupted："+isInterrupted());
                if(isInterrupted()) {
                    System.out.println(Thread.currentThread().getName() + " isInterrupted：" + isInterrupted());
                    break;
                }
            }
        }
    }

    private static class XiaoMiThread extends Thread{

        private GilgThread thread;

        private XiaoMiThread(){

        }
        private XiaoMiThread(GilgThread thread){
            this.thread = thread;
        }

        @Override
        public void run() {

            System.out.println("小米领号去打饭……");

            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
                //中断后，2个线程都处于就绪状态，谁获得了 CPU谁执行
                Thread.currentThread().interrupt();
            }

            if(isInterrupted()) {
                System.out.println("小米往家跑去……");
                System.out.println(Thread.currentThread().getName() + " isInterrupted：" + isInterrupted());
                return;
            }

            System.out.println("小米打完饭111111111");

        }
    }
    private static class GilgThread extends Thread{
        @Override
        public void run() {
            System.out.println("美女领号去打饭……");

           /* try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("111111111111111");
            }*/
            System.out.println("美女打完饭111111111");
        }
    }




    public static void main(String[] args){

        {//测试interrupt对sleep的影响

            /*UseThread useThread = new UseThread();
            useThread.start();
            useThread.interrupt();*/
        }


        {//故事场景：小米去领号打饭，美女来了，小米让美女在他前面打饭，美女打完饭后，小米有急事回家，就不打饭了。

            //测试interrupt对join的影响
           /* GilgThread gilgThread = new GilgThread();
            XiaoMiThread xiaomi = new XiaoMiThread(gilgThread);
            xiaomi.start();

            gilgThread.start();
            xiaomi.interrupt();*///小米家中有事，跑回家（不按顺序了）
        }

        {//测试interrupt对wait的影响

        }
    }
}
