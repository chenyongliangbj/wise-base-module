package com.chenyl.module.base.staticTest;

public class StaticDemo {

    public static int x = 100;

    public void test(){
        x++;
    }
    public static void test1(){
        x--;
    }

    public static void main(String[] args) {

        StaticDemo d1 = new StaticDemo();
        d1.x++;
        d1.test();

        StaticDemo d2 = new StaticDemo();
        d2.x++;

        StaticDemo.x--;
        StaticDemo.test1();

        System.out.println("x:"+x);
    }
}
