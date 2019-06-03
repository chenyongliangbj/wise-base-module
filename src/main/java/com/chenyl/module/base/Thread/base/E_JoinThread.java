package com.chenyl.module.base.Thread.base;

import com.chenyl.module.utils.SleepTools;

/**
 * 类说明：演示Join（）方法的使用
 *
 * 把指定的线程加入到当前线程，可以将两个交替执行的线程合并为顺序执行。
 * 比如在线程B中调用了线程A的Join()方法，直到线程A执行完毕后，才会继续执行线程B。
 *
 * 打饭的例子：
 * 你去打饭，一个美女插到前面打饭，美女打完饭你才能打饭。
 * 美女的男朋友插到前面，美女的男朋友打完饭，美女才能打饭，美女打完饭，你才能打饭。
 **/
public class E_JoinThread {


    static class Goddess implements Runnable {
        private Thread thread;

        public Goddess(Thread thread) {
            this.thread = thread;
        }

        public Goddess() {
        }

        public void run() {
            System.out.println("Goddess开始排队打饭.....");
            try {
                if(thread!=null) thread.join();
            } catch (InterruptedException e) {
            }
            SleepTools.second(2);//休眠2秒
            System.out.println(Thread.currentThread().getName()
                    + " Goddess打饭完成.");
        }
    }

    static class GoddessBoyfriend implements Runnable {

        public void run() {
            SleepTools.second(2);//休眠2秒
            System.out.println("GoddessBoyfriend开始排队打饭.....");
            System.out.println(Thread.currentThread().getName()
                    + " GoddessBoyfriend打饭完成.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        GoddessBoyfriend goddessBoyfriend = new GoddessBoyfriend();
        Thread gbf = new Thread(goddessBoyfriend);
        Goddess goddess = new Goddess(gbf);
        Thread g = new Thread(goddess);
        g.start();
        gbf.start();
        System.out.println("lison开始排队打饭.....");
        g.join();
        SleepTools.second(2);//让主线程休眠2秒
        System.out.println(Thread.currentThread().getName() + " lison打饭完成.");
    }
}
