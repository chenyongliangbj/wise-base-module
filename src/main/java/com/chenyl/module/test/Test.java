package com.chenyl.module.test;

public class Test {

    public static void main(String[] args){


        String s = "cake";

        s = s.toUpperCase();
        int len = s.length();

        s = s.trim();

        try{
            ((A)new B()).process();
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}


class A {

    public void process(){
        System.out.println("A ");
    }
}



class B extends  A{
    public void process() throws RuntimeException{
        super.process();
        if(true)throw new RuntimeException();

        System.out.print("B");
    }
}
