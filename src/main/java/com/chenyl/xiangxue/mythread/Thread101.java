package com.chenyl.xiangxue.mythread;

import org.openjdk.jol.info.ClassLayout;
/**
 *
 * //关闭延迟开启偏向锁
 * -XX:BiasedLockingStartupDelay=0
 * //禁止偏向锁
 * -XX:-UseBiasedLocking
 * //启用偏向锁
 * -XX:+UseBiasedLocking
 *
 * @author cyl
 * @date 2020/12/18 16:05
 */
public class Thread101 {
    static final L l = new L();

    public static void main(String[] args) {
        //无锁可偏向 无hash  偏向锁：101
        System.out.println(ClassLayout.parseInstance(l).toPrintable());

        synchronized (l){
            //加锁后： 变成偏向锁：101 、 线程Id
            System.out.println(ClassLayout.parseInstance(l).toPrintable());
        }
        //释放锁后：和加锁的值一样
        System.out.println(ClassLayout.parseInstance(l).toPrintable());

        synchronized (l){
            //再次加锁的时候，只需要判断线程Id是否相同，如果相同就可以直接加锁。
            System.out.println(ClassLayout.parseInstance(l).toPrintable());
        }

    }
}
