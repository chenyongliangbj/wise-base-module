package com.chenyl.module.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncLockDemo {

    /**
     * 显示锁：具体的实现ReentrantLock(可重入锁)：手动加锁、解锁
     *
     * 隐式锁（JVM内置锁）：自动加锁、解锁
     */
    private Lock reentrantLock = new ReentrantLock();
}
