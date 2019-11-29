package com.chenyl.module.base.staticTest;

public class BaseStaticTest {
    {//初始化
        System.out.println("base 初始化");
    }
    static{//静态初始化
        System.out.println("base 静态代码块");
    }
    //构造方法
    BaseStaticTest(){
        System.out.println("base construction...");
    }
}
