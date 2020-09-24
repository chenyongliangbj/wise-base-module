package com.chenyl.xiangxue.jvm;

public class Test04 {
    public static void main(String[] args) {

        try {
            int a = 13/0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("3333");
        }
    }
}
