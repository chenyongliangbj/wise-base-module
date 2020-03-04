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

    private static final Object ob = new Object();//锁

    public static class UseThread extends  Thread{

        @Override
        public void run() {

            synchronized (ob){

                    try {
                        System.out.println(Thread.currentThread().getName()+":线程正在等待运行");
                        ob.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        Thread.currentThread().interrupt();
                    }

                    System.out.println(Thread.currentThread().getName()+":线程结束了");

            }

        }

    }


    public static void main(String[] args){



        UseThread useThread = new UseThread();
        useThread.start();

        UseThread useThread2 = new UseThread();
        useThread2.start();



        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (ob){
            System.out.println("时间到了，通知ob对象的所有等待线程运行。。。");
            ob.notifyAll();
        }
    }
}
