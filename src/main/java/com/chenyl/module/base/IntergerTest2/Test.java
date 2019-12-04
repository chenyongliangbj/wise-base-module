package com.chenyl.module.base.IntergerTest2;


public class Test {
    public static void main(String[] args) {
        //byte 自动转换成 short
        byte abyte = 10;
        short ashort = abyte;
        System.out.println(ashort);

        //short 自动转换成 int
        short ashort2 = 180;
        int aint = ashort2;
        System.out.println(aint);

        //int 自动转换成 long
        int aint2 = 100;
        long along = aint2;
        System.out.println(along);

        //long 自动转换成 float
        long along2 = 100;
        float afloat = along2;
        System.out.println(afloat);

        //float 自动转换成 double
        float afloat2 = 100.00F;
        double adouble = afloat2;
        System.out.println(adouble);
    }
}
