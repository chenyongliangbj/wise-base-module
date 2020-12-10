package com.chenyl.wise;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String a= "2";
        Test test = new Test();
        test.B();

        int[] ints = new int[2];

        Arrays.sort(ints);

        Thread thread = new Thread();
        thread.start();
    }

    public void B(){
        B();
    }
}
