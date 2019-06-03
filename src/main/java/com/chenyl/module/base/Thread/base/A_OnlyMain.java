package com.chenyl.module.base.Thread.base;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 类说明：只有一个main方法的程序
 *
 * 一个Java程序从main()方法开始执行，然后按照既定的代码逻辑执行，看似没有其他线程参与，但实际上Java程序天生就是多线程程序，因为执行main()方法的是一个名称为main的线程。
 * [6] Monitor Ctrl-Break //监控Ctrl-Break中断信号的
 * [5] Attach Listener //内存dump，线程dump，类信息统计，获取系统属性等
 * [4] Signal Dispatcher  // 分发处理发送给JVM信号的线程
 * [3] Finalizer  // 调用对象finalize方法的线程
 * [2] Reference Handler//清除Reference的线程
 * [1] main //main线程，用户程序入口
 **/
public class A_OnlyMain {
    public static void main(String[] args){
        //Java虚拟机线程系统的管理接口
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //不需要获取同步的Moniter和synchronizer信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        //遍历线程信息，仅打印线程ID和线程名称信息

        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" +threadInfo.getThreadId()+"]"+threadInfo.getThreadName());
        }
    }
}
