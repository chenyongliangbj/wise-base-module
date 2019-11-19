package com.chenyl.module.base.abstractAndinterface;

/**
 * 函数式接口
 * Method 
 * @author Chenyl
 * @date 2019/11/18 20:37
 **/
@FunctionalInterface
public interface InterfaceTest {

    public abstract void abstractTest();

    public default void defaultTest(String name){
        System.out.println("defaultTest:"+name);
    }
    public static void staticTest(){
        System.out.println("staticTest: ....");
    }

    public abstract String toString();

    /*private void privateTest(){
        //TODO
    }
    private static void privateStaticTest(){
        //TODO
    }*/
}
