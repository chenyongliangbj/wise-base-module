package com.chenyl.module.base.staticTest;

public class ExtendsStaticTest extends BaseStaticTest{

    {//初始化
        System.out.println("extends 初始化");
    }
    static{//静态初始化
        System.out.println("extends 静态代码块");
    }
    //构造方法
    ExtendsStaticTest(){
        System.out.println("extends construction...");
    }
    
    public static void main(String[] args){
        ExtendsStaticTest test = new ExtendsStaticTest();
        System.out.println();
        //程序运行时静态初始化块最先被执行，然后执行普通初始化块，最后才执行构造方法。由于静态初始化块只在类加载时执行一次，所以当再次创建对象时并未执行静态初始化块。
        ExtendsStaticTest test1 = new ExtendsStaticTest();
    }
}
