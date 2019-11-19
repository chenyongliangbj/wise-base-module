package com.chenyl.module.base.abstractAndinterface;

public class Test {
    public static void main(String[] args) {
        ClassTest classTest = new ClassTest();
        classTest.abstractTest();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程："+Thread.currentThread().getName());
            }
        });

        new Thread(()->System.out.println("线程："+Thread.currentThread().getName()));

        System.out.println(System.nanoTime());
    }
}
