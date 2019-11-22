package com.chenyl.module.base.abstractAndinterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Stream
 **/
public class StreamTest {
    public static void main(String[] args){


        List<Integer> list = Arrays.asList(8,3,4,6,7,9,1);

        /**测试终止操作*/
        //1.判断所有值为偶数
        boolean a = list.stream().allMatch(num -> num % 2 == 0);
        System.out.println(a);//false
        //2.判断存在数值为偶数
        boolean b = list.stream().anyMatch(num -> num % 2 == 0);
        System.out.println(b);//true
        //3.判断不存在大于10的数
        boolean c = list.stream().noneMatch(num -> num > 10);
        System.out.println(c);//true
        //3.返回第一个元素
        Optional<Integer> d = list.stream().findFirst();
        System.out.println(d.get());//8
        //4.返回任意元素
        Optional<Integer> e = list.stream().findAny();
        System.out.println(e.get());//找不到就抛出异常，最好设置默认值
        Integer e1 = list.stream().findAny().orElse(0);
        System.out.println(e1);
        //5.count 统计数量
        long f = list.stream().count();
        System.out.println(f);//7
        //6.返回最大值
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(max.get());//9
        //7.返回最小值
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        System.out.println(min.get());//1
        //8.归约:求最大值
        Optional<Integer> reduce = list.stream().reduce((r1, r2) -> r1 >= r2 ? r1 : r2);
        System.out.println(reduce.get());//9
        //9.收集：偶数列表
        List<Integer> evenNum = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNum);//[8, 4, 6]
        //10.遍历
         list.stream().forEach(System.out::print);//8346791
        //11.迭代器
        Iterator<Integer> iterator = list.stream().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());//8346791
        }
        //12.toArray
        Integer[] array1 = list.stream().toArray(in -> new Integer[list.size()]);
        Integer[] array2 = list.stream().toArray(Integer[]::new);
        Object[] array3 = list.stream().toArray();

        /**测试中间操作*/
        //1.filter：过滤
        List<Integer> evenNums = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNums);//[8, 4, 6]
        //2.map:映射  举例：映射成+2的数据
        List<Integer> map1 = list.stream().map(m1 -> m1+2).collect(Collectors.toList());
        System.out.println(map1);//[10, 5, 6, 8, 9, 11, 3]
        //3.limit：保留前几条
        List<Integer> test1 = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(test1);//[8, 3, 4]
        //4.skip：跳过前几条
        List<Integer> test2 = list.stream().skip(3).collect(Collectors.toList());
        System.out.println(test2);//[6, 7, 9, 1]
        //4.skip：跳过前几条
        List<Integer> test3 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(test3);//[8, 3, 4, 6, 7, 9, 1] 尴尬，没有重复的数字
        //5.sort：排序
        List<Integer> test4 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(test4);//[1, 3, 4, 6, 7, 8, 9]
    }
}
