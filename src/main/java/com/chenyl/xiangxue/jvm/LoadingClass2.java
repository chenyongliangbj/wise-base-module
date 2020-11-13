package com.chenyl.xiangxue.jvm;


class  SuperClass{

    static{
        System.out.println("supperClass init!");
    }

    public static int value = 123;
}

class  SubClass extends SuperClass{

    static{
        System.out.println("SubClass init!");
    }
}

class ConstClass{
    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLOWORLD = "hello world";
}
/**
 * Title LoadingClass
 * Description
 * @author Chenyl
 * @date 2020/9/24 18:11
 *
 *   配置： -XX:+TraceClassLoading 观察加载了哪些类
 *
 **/
class NotInitialization{
    public static void main(String[] args){

        //1.通过子类引用父类的静态字段，不会导致子类初始化
//        System.out.println(SubClass.value);

        //2.通过数组定义来引用类，不会触发此类的初始化
//        SuperClass[] sca = new SuperClass[10];

        //3.常量在编译阶段会存入调用类的类的常量池中，本质上没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化。
        System.out.println(ConstClass.HELLOWORLD);

    }
}
