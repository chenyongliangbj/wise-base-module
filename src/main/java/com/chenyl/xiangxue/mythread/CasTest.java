package com.chenyl.xiangxue.mythread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class CasTest {

    private static AtomicInteger count = new AtomicInteger();

    private static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {

        reentrantLock.lock();

        count.getAndAdd(1);


    }
}
