package com.chenyl.module.base.Thread;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  1.测试CountDownLatch 点火器
 *  2.测试synchronized
 */
public class ThreadTest2 {

    public static int count = 0;
    CountDownLatch countDownLatch = new CountDownLatch(10);

    public  void runThread() throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            countDownLatch.countDown();

            executorService.submit(new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"线程开始启动了...........");

                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int j = 0; j < 100000; j++) {
                    synchronized (ThreadTest2.class){//使用synchronized关键字枷锁后，最终count永远是一样的
                        count++;
                    }
                }
//                System.out.println("开始计算count,线程："+Thread.currentThread().getName()+" 时间："+new Date());
            }));
        }
    }

    public void countDown() throws InterruptedException {
        countDownLatch.await();
        Thread.sleep(1000);
        System.out.println("最终结果count="+count);
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadTest2 threadTest2 = new ThreadTest2();
        threadTest2.runThread();
        threadTest2.countDown();

    }
}
