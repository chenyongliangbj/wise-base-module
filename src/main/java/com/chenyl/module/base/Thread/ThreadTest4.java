package com.chenyl.module.base.Thread;

import java.util.concurrent.ExecutionException;

/**
 * ThreadLocal详解
 */
public class ThreadTest4 {


    /**
      * 1、ThreadLocal为每个线程都提供了变量的副本，使得每个线程在某一时间訪问到的并非同一个对象，这样就隔离了多个线程对数据的数据共享
     */


    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();


    private static class UseThread implements Runnable{

        @Override
        public void run(){

        }
    }



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        {
            UseThread useThread = new UseThread();
            for (int i = 0; i < 5; i++) {
                new Thread(useThread).start();
            }
        }
    }
}
