package com.chenyl.module.base.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        map.put("a","1");
        map.put("a","2");
        map.put("a","3");

        System.out.println(map);

    }
}
