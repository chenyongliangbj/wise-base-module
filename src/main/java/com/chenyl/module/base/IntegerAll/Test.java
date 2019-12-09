package com.chenyl.module.base.IntegerAll;

public class Test {
    private byte aByte;
    private short aShort;
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private boolean aBoolean;
    private char aChar;

    public static void main(String[] args){

        Test test = new Test();
        System.out.println("byte 默认值："+test.aByte);
        System.out.println("short 默认值："+test.aShort);
        System.out.println("int 默认值："+test.anInt);
        System.out.println("long 默认值："+test.aLong);
        System.out.println("float 默认值："+test.aFloat);
        System.out.println("double 默认值："+test.aDouble);
        System.out.println("boolean 默认值："+test.aBoolean);
        System.out.println("char 默认值："+test.aChar);

        System.out.println("byte 最大值："+Byte.MAX_VALUE);
        System.out.println("byte 最小值："+Byte.MIN_VALUE);

        System.out.println("short 最大值："+Short.MAX_VALUE);
        System.out.println("short 最小值："+Short.MIN_VALUE);

        System.out.println("int 最大值："+Integer.MAX_VALUE);
        System.out.println("int 最小值："+Integer.MIN_VALUE);

        System.out.println("long 最大值："+Long.MAX_VALUE);
        System.out.println("long 最小值："+Long.MIN_VALUE);

        System.out.println("float 最大值："+Float.MAX_VALUE);
        System.out.println("float 最小值："+Float.MIN_VALUE);

        System.out.println("double 最大值："+Double.MAX_VALUE);
        System.out.println("double 最小值："+Double.MIN_VALUE);

        System.out.println("boolean 最大值："+Boolean.TRUE);
        System.out.println("boolean 最小值："+Boolean.FALSE);

        System.out.println("char 最大值："+Character.MAX_VALUE);
        System.out.println("char 最小值："+Character.MIN_VALUE);
    }
}
