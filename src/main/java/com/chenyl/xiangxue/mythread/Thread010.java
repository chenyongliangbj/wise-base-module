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
public class Thread010 {
    static final L l = new L();

    public static void main(String[] args) {
        //无锁可偏向 无hash 偏向锁：101
        System.out.println(ClassLayout.parseInstance(l).toPrintable());

        //hash
        System.out.println(Integer.toHexString(l.hashCode()));

        //无锁有hash  无锁：001
        System.out.println(ClassLayout.parseInstance(l).toPrintable());
        synchronized (l){
            //加锁后： 无锁有hash 直接膨胀为轻量锁：00
            System.out.println(ClassLayout.parseInstance(l).toPrintable());
        }
        //释放锁后： 轻量锁释放锁后变为无锁：001
        System.out.println(ClassLayout.parseInstance(l).toPrintable());

        synchronized (l){
            //再次加锁的时候，轻量锁
            System.out.println(ClassLayout.parseInstance(l).toPrintable());
        }

    }
}
