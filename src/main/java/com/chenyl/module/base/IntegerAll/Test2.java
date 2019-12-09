package com.chenyl.module.base.IntegerAll;

public class Test2 {

    private Byte aByte;
    private Short aShort;
    private Integer anInt;
    private Long aLong;
    private Float aFloat;
    private Double aDouble;
    private Boolean aBoolean;
    private Character aChar;

    public static void main(String[] args){
        Test2 test = new Test2();
        System.out.println("Byte 默认值："+test.aByte);
        System.out.println("Short 默认值："+test.aShort);
        System.out.println("Integer 默认值："+test.anInt);
        System.out.println("Long 默认值："+test.aLong);
        System.out.println("Float 默认值："+test.aFloat);
        System.out.println("Double 默认值："+test.aDouble);
        System.out.println("Boolean 默认值："+test.aBoolean);
        System.out.println("Character 默认值："+test.aChar);
    }
}
