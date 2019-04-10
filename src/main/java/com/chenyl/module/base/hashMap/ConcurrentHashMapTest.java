package com.chenyl.module.base.hashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
    public static void main(String[] args){
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put("1","aaa");

        System.out.println(map.get("1"));
    }
}
