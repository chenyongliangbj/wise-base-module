package com.chenyl.module.base.abstractAndinterface;

public class ClassTest implements InterfaceTest {
    @Override
    public void abstractTest() {
        System.out.println("ClassTest: this.is a abstractTest");
    }
}
