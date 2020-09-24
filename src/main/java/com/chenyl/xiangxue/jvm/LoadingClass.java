package com.chenyl.xiangxue.jvm;

/**
 * Title LoadingClass
 * Description 虚拟机类加载机制
 * @author Chenyl
 * @date 2020/9/23 17:51
 *
 *
 *   类型的生命周期： 加载 -》 验证 、 准备、解析 -》 初始化 =》使用 =》 卸载
 *
 *   6种情况立即初始化
 *   1.
 *   new getstatic putstatic invokestatic
 *
 **/
public class LoadingClass {

    static{
        System.out.println("loading class init");
    }

    public static String test = "loading class test";

    public static void main(String[] args){

        //1.使用new关键字实例化对象的时候
        // new
        LoadingClass loadingClass = new LoadingClass();
        //2.读取或设置一个类型的静态字段（被final修饰、已在编译期把结果放入常量池的静态字段除外）的时候
        // getstatic
        loadingClass.test = "dsf";
        //3.调用一个类型的静态方法的时候
        // invokestatic
        staticInter();
    }

    private static void staticInter(){
        System.out.println("this is a staticInter");
    }
}
