package com.chenyl.module.base.abstractAndinterface;

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
}
