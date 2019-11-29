package com.chenyl.module.base.staticTest;

/**
 * Title StaticTest
 * Description 静态static
 * @author Chenyl
 * @date 2019/11/26 20:58
 **/
public class StaticTest {

    //1.static静态变量
    private static int num = 10;

    private static final int num2 = 10;
    
    private int age;

    public static void main(String[] args){

        System.out.println(StaticTest.num);
//        System.out.println(StaticTest.age);

        StaticTest staticTest = new StaticTest();
        System.out.println(staticTest.num);
        System.out.println(staticTest.age);
    }

    public static void printTest(){
        //1.静态方法中可以直接调用静态变量
        System.out.println(num);

        //2.静态方法中不可以直接调用实例变量
//        System.out.println(age);

        //3.静态方法中可以通过对象调用实例变量
        StaticTest staticTest = new StaticTest();
        System.out.println(staticTest.age);
    }

    public void printTest2(){
        //1.普通方法可以调用静态变量
        System.out.println(num);
        //1.普通方法可以调用实例变量
        System.out.println(age);
    }

    public static void printTest3(){

        //1.静态方法中可以直接调用静态方法
        printTest();

        //2.静态方法中不可以调用非静态方法
//        printTest2();

        //3.静态方法可以通过对象调用非静态方法
        StaticTest staticTest = new StaticTest();
        staticTest.printTest2();

    }
}