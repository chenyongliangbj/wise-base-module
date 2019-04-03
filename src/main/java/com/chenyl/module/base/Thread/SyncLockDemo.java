package com.chenyl.module.base.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncLockDemo {

    /**
     * 显示锁：具体的实现ReentrantLock(可重入锁)：手动加锁、解锁
     *
     *
     *
     * 隐式锁（JVM内置锁）：自动加锁、解锁
     */
    private Lock reentrantLock = new ReentrantLock();

    public void lockDemo(){
        reentrantLock.lock();
        reentrantLock.unlock();
    }


    public static final Object lock = new Object();

    public  void syncDemo1(){
        synchronized (reentrantLock){
            //业务逻辑
            //连接你的jdbc
            //你去排序
        }
    }

    public synchronized  static void syncDemo2(){

        //业务逻辑
        //连接你的jdbc
        //你去排序
    }

    public synchronized  void syncDemo3(){

        //业务逻辑
        //连接你的jdbc
        //你去排序
    }


    public static void main(String[] args){

    }
}
