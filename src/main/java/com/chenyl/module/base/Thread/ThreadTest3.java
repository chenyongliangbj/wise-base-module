package com.chenyl.module.base.Thread;

import java.util.concurrent.ExecutionException;

/**
 * synchronized错误使用 锁Integer是错误的，因为锁不住Integer
 *
 *  volatile保证可见性，不保证原子操作
 *  volatile最适用的场景：一个线程写，多个线程读
 */
public class ThreadTest3 {

    /**
      * volatile保证可见性，不保证原子操作
     *  volatile最适用的场景：一个线程写，多个线程读
      **/

    private volatile static boolean ready = false; //使用volatile 打印出number:51  不使用，不打印
    private static  int number;


    /**
      * 继承类Thread
     */
    private static class UseThread implements Runnable{

        private Integer i;

        private Object o = new Object();//锁

        public UseThread(Integer i){
            this.i = i;
        }

        @Override
        public void run(){
//            synchronized (i){//锁Integer锁不住
            synchronized (o){
                Thread thread = Thread.currentThread();
                i++;
                System.out.println(thread.getName()+"---------"+i+"-@"+System.identityHashCode(i));
//                System.out.println(thread.getName()+"---------"+i+"-@");
            }
        }
    }

    /**
     * 实现接口Runnable
     */
    private static class UseRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" is running");
            while(!ready);
            System.out.println("number:"+number);
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        {
            //测试synchronized关键字
            UseThread useThread = new UseThread(1);
            for (int i = 0; i < 5; i++) {
                new Thread(useThread).start();
            }
        }

        {//测试
            UseRunnable useRunnable = new UseRunnable();
            new Thread(useRunnable).start();

//            Thread.sleep(5000);
            number = 51;
            ready = true;
            Thread.sleep(5000);
            System.out.println("main is end");
        }

    }
}
