package com.chenyl.module.base.Thread.base;

/**
 * 类说明：测试wait/notify/notifyAll
 *
 * 1.等待方遵循如下原则：
 * synchronized(对象){
 *     while(条件不满足){
 *         对象.wait();
 *     }
 *     对应的逻辑处理
 * }
 *
 * 2.通知方遵循如下原则：
 * synchronized(对象){
 *       改变条件
 *       对象.notifyAll();
 *   }
 *
 */
public class F_WNThread {

    private static int num = 0;

    private static Object ob = new Object();//锁

    private static class UseThread extends  Thread{

        @Override
        public void run() {

            synchronized (ob){
                while(num < 200){

                    System.out.println("ddddddd");
                    try {
                        ob.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("ccccccc"+num);
                }

                System.out.println("eeeeeeeee"+num);
            }

        }

    }

    private static class UseThread2 extends Thread{
        @Override
        public void run() {
            synchronized (ob){
                num = 200;
                System.out.println("通知");
                ob.notifyAll();
            }
        }
    }

    public static void main(String[] args){



        UseThread useThread = new UseThread();
        useThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        UseThread2 useThread2 = new UseThread2();
        useThread2.start();
    }
}
