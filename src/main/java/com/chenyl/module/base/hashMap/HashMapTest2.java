package com.chenyl.module.base.hashMap;

import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest2 {
    public static void main(String[] args){

        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();

        for (int i = 0; i < 100; i++) {
            MyThread myThread = new MyThread(map, "线程名字：" + i);
            myThread.start();
        }
    }

    static class MyThread extends Thread{

        public ConcurrentHashMap map;
        public String name;

        public MyThread(ConcurrentHashMap map, String name) {
            this.map = map;
            this.name = name;
        }

        public void run() {
            for (int i = 0; i < 100000; i++) {
                double num = Math.random()*10000;
                map.put("key"+num,"value"+num);
                map.remove("key"+num);
                System.out.println("i:"+i+" num："+num +" size:"+map.size());
            }
        }
    }
}
