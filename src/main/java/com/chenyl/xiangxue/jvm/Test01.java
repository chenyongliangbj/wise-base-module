package com.chenyl.xiangxue.jvm;

/**
 * Title Test01
 * Description
 * @author Chenyl
 * @date 2020/9/9 9:37
 *
 *  使用工具查看t1/t2 在新生代还是老生代
 *  HSDB
 *
 *  JVM初始分配的内存由-Xms指定，默认是物理内存的1/64
 *  JVM最大分配的内存由-Xmx指定，默认是物理内存的1/4
 *
 * -Xms30m -Xmx30m -Xss1m -XX:MaxMetaspaceSize=30m -XX:+UseConcMarkSweepGC -XX:-UseCompressedOops
 **/
public class Test01 {

    public final static String MAN_TYPE = "man";
    public static String WOMAN_TYPE = "woman";

    public static void main(String[] args) throws InterruptedException {

        Teacher t1 = new Teacher();
        t1.setName("cyl");
        t1.setSexType(MAN_TYPE);
        t1.setAge(28);

        for (int i = 0; i < 15; i++) {
            System.gc();//主动触发GC
        }

        Teacher t2 = new Teacher();
        t2.setName("guolin");
        t2.setSexType(WOMAN_TYPE);
        t2.setAge(25);

        Thread.sleep(Integer.MAX_VALUE);

    }
}
