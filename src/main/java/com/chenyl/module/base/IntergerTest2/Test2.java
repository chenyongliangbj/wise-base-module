package com.chenyl.module.base.IntergerTest2;

public class Test2 {
    public static void main(String[] args) {

        //double 强制转换成 float
        double adouble = 180.12D;
        float afloat = (float) adouble;
        System.out.println(afloat);

        //float 强制转换成 long
        float afloat2 = 180.12f;
        long along = (long) afloat2;
        System.out.println(along);

        //long 强制转换成 int
        long along2 = 180;
        int aint = (int) along2;
        System.out.println(aint);

        //int 强制转换成 short
        int aint2 = 180;
        short ashort = (short) aint2;
        System.out.println(ashort);

        //short 强制转换成 byte
        short ashort2 = 180;
        byte abyte = (byte) ashort2;
        System.out.println(abyte);


        System.out.println("short 最大值："+Short.MAX_VALUE);
        System.out.println("short 最小值："+Short.MIN_VALUE);
    }
}
