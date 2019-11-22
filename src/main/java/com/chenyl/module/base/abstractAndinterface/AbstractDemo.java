package com.chenyl.module.base.abstractAndinterface;

import com.alibaba.fastjson.JSON;

public class AbstractDemo extends AbstractTest{

    public static void main(String[] args){
        AbstractDemo demo = new AbstractDemo();
        System.out.println(JSON.toJSONString(demo));
    }

    @Override
    public void test() {

    }
}