package com.chenyl.module.base.IntegerAll;

import com.alibaba.fastjson.JSON;

public class Test3 {
    public static void main(String args[]) {
        Integer a = 127;
        Integer b = 127;
        System.out.println((a == b));


        //二进制
        int aa = 0b10000000000000000000000010110100;
        System.out.println(aa);

        int aaa =0b10000000000000000000000010110100;
        System.out.println("aaa:"+aaa);

        //-2147483648
        System.out.println(-2147483468 - 180);

        //int->二进制
        System.out.println("Integer:"+Integer.toBinaryString(-180));


        //二进制->short  前16位随便写 0000 0000 1011 0100 -> 180
        System.out.println(Integer.valueOf("111111110000000010110100", 2).shortValue());

        //short -> 二进制
        byte[] bytes = ByteUtils.shortToByte16((short) -180);
        for (byte aByte : bytes) {
            System.out.print(aByte);
        }

        System.out.println();

        //二进制-》byte
        System.out.println(Integer.valueOf("01111111", 2).byteValue());

        System.out.println(Integer.valueOf("10000001", 2).byteValue());
    }
}
