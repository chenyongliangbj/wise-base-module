package com.chenyl.xiangxue.jvm;

public class LambdaDemo {
    public static void main(String[] args){

       Runnable runnable=() ->System.out.println("sout");
       runnable.run();


    }
}
