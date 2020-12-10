package com.chenyl.xiangxue.mythread;

import org.openjdk.jol.info.ClassLayout;


/**
 * 锁膨胀
 * 偏向锁 -》 轻量级锁 -》 重量级锁
 * @author cyl
 * @date 2020/12/9 13:50
 * @copyright www.hanshow.com All rights reserved.
 */
public class ObjectHead {
    static final L l = new L();

    static Thread t1;
    static Thread t2;
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Integer.toHexString(l.hashCode()));

        t1 = new Thread(ObjectHead::testLock);
        t2 = new Thread(ObjectHead::testLock);

        t1.start();
//        t1.join();
        t2.start();

    }
    public static void testLock(){
        synchronized (l){
            System.out.println(ClassLayout.parseInstance(l).toPrintable());
        }
    }
}
