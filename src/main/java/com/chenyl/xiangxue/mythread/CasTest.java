package com.chenyl.xiangxue.mythread;

import java.util.concurrent.atomic.AtomicInteger;

public class CasTest {

    private static AtomicInteger count = new AtomicInteger();

    public static void main(String[] args) {

        synchronized (count){

        }

        count.getAndAdd(1);
    }
}
