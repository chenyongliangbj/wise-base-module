package com.chenyl.module.base.abstractAndinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Lambda表达式语法：
 * () -> {}()；
 * (参数类型 参数名称) -> { 代码语句 }；
 * //小括号里无参数则留空()，有一个参数括号可以省略，多个参数用逗号隔开
 *
 *
 **/
public class LambdaTest {

    public static void main(String[] args){

        //1.遍历list输出对象的值
        List<String> list = Arrays.asList("test1", "test2", "test3", "test4", "test5");
        list.forEach(s-> System.out.print(s+","));

        //2.遍历获取List的sku列表
        List<GoodsInfo> goodsInfos = Arrays.asList(new GoodsInfo("001",100L),new GoodsInfo("002",200L),new GoodsInfo("003",300L));
        List<String> skuList = goodsInfos.stream().map(GoodsInfo::getSku).collect(Collectors.toList());

        //3.方法引用
        /**
         * 对象::实例方法
         *  类::静态方法
         *  类::实例方法
         **/
        goodsInfos.stream().forEach(GoodsInfo::getSku);


    }
}
