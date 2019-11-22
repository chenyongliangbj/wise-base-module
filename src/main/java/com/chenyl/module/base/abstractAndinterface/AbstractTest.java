package com.chenyl.module.base.abstractAndinterface;

import java.util.UUID;

public abstract class AbstractTest{

    private String id;

    AbstractTest(){
        this.id = UUID.randomUUID().toString().replace("-", "");
    }
    public static void main(String[] args){
        System.out.println("test");
    }

    public  abstract void test();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}