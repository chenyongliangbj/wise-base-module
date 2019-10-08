package com.chenyl.module.base.collection;

import java.util.Arrays;

/**
 *
 * 数组特点：
 * 1.数值数组元素的默认值为 0，而引用元素的默认值为 null。
 * 2.数组的索引从 0 开始，如果数组有 n 个元素，那么数组的索引是从 0 到（n-1）。
 * 3.数组元素可以是任何类型，包括数组类型。
 * 4.数组类型是从抽象基类 Array 派生的引用类型。
 *
 *
 * @date 2019/10/8 9:44
 **/
public class Array {


    public static void main(String[] args){

        /* 数组默认值：
         * 1、int类型定义的数组，初始化默认是0
         * 2、String类型定义的数组，默认值是null
         * 3、char类型定义的数组，默认值是0对应的字符
         * 4、double类型定义的数组，默认值是0.0
         * 5、float类型定义的数组，默认值是0.0
         **/
        int[] x = new int[20];
        System.out.println(x[19]);//输出结果：0
        System.out.println(x[0]);//输出结果：0

        String[] strings = new String[20];
        System.out.println(strings[0]);//输出结果：null

        char[] chars = new char[20];
        System.out.println(chars[0]);//输出结果： 看起来是一个空格，实际是一个 unicode字符 （\u0000）

        double[] doubles = new double[20];
        System.out.println(doubles[0]);//输出结果：0.0

        float[] floats = new float[20];
        System.out.println(floats[0]);//输出结果0.0


        /* Arrays类：
         * 1.Arrays.equals()：比较
         * 2.Arrays.fill()：填充
         * 3.Arrays.sort()：排序
         * 4.Arrays.binarySearch()：查找
         * 5.Arrays.copyOf()/copyOfRange() 复制
         * 6.Arrays.arraycopy() 复制数组，替换目标数组中的部分元素
         **/

        {//1.Arrays.equals()：比较
            double[] score1 = { 99, 100, 98.5, 96.5, 72 };
            double[] score2 = { 99, 100, 98.5, 96.5, 72 };
            if (Arrays.equals(score1, score2)) { //for循环遍历
                System.out.println("score1 数组和 score2 数组相等");
            } else {
                System.out.println("score1 数组和 score2 数组不等");
            }
        }
        {//2.Arrays.fill()：填充
            //填充是把所有的下标的元素都设置为被填充数。
            int[] number = new int[8];
            Arrays.fill(number, 100);//for循环设置

            for (int i = 0; i < 8; i++) {
                System.out.print(number[i]+" ");
            }
        }
        {//3.Arrays.sort()：排序
            double[] score = { 99.5, 100, 98, 97.5, 100, 95, 85.5, 100 };
            Arrays.sort(score);

            for (int i = 0; i < score.length; i++) {
                System.out.print(score[i]+" ");
            }
        }
        System.out.println();
        {//4.Arrays.binarySearch()：查找

            //查找之前必须排序。如果没有对数组进行排序，则结果是不确定的
            double[] score = { 85.5,95.0,97.5,98.0,99.5,100.0,100.0,100.0  };
            System.out.println(Arrays.binarySearch(score, 100));
        }
        {//5.Arrays.copyOf()/copyOfRange() 复制
            double[] score = { 85.5,95.0,97.5,98.0,99.5,100.0,100.0,100.0  };

            double[] score2 = Arrays.copyOf(score,5);
            for (int i = 0; i < score2.length; i++) {
                System.out.print(score2[i]+" ");
            }

            System.out.println();

            double[] score3 = Arrays.copyOf(score,10);
            for (int i = 0; i < score3.length; i++) {
                System.out.print(score3[i]+" ");
            }
            System.out.println();

            double[] score4 = Arrays.copyOfRange(score,2,10);
            for (int i = 0; i < score4.length; i++) {
                System.out.print(score4[i]+" ");
            }
        }
        System.out.println();
        {//6.Arrays.arraycopy() 复制数组，替换目标数组中的部分元素
            double[] score = { 85.5,95.0,97.5,98.0,99.5,101.0,100.0,100.0  };
            double[] score2 = { 85.5,95.0,97.5,98.0,99.5,100.0,100.0,100.0  };

            System.arraycopy(score,0,score2,2,6);

            for (int i = 0; i < score2.length; i++) {
                System.out.print(score2[i]+" ");
            }
        }


    }


}
