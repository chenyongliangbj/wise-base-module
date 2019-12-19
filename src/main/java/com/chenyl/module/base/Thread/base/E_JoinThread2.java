package com.chenyl.module.base.Thread.base;

import com.chenyl.module.utils.SleepTools;

/**
 * 类说明：演示Join（）方法的使用
 *
 * 把指定的线程加入到当前线程，可以将两个交替执行的线程合并为顺序执行。
 * 比如在线程B中调用了线程A的Join()方法，直到线程A执行完毕后，才会继续执行线程B。
 *
 *
 * join()方法只会使主线程进入等待池并等待该线程执行完毕后才会被唤醒。并不影响同一时刻处在运行状态的其他线程
*
 * 打饭的例子：
 * 你去打饭，一个美女插到前面打饭，美女打完饭你才能打饭。
 * 美女的男朋友插到前面，美女的男朋友打完饭，美女才能打饭，美女打完饭，你才能打饭。
 **/
public class E_JoinThread2 {

    static class Girl implements Runnable {
        private Thread thread;

        public Girl(Thread thread) {
            this.thread = thread;
        }

        public Girl() {
        }

        public void run() {
            System.out.println("Girl 开始排队打饭.....");
            try {
                if(thread!=null) thread.join();
            } catch (InterruptedException e) {
            }
            SleepTools.second(2);//休眠2秒
            System.out.println(Thread.currentThread().getName()
                    + " Girl 打饭完成.");
        }
    }



    public static void main(String[] args) throws InterruptedException {
        Girl girl = new Girl();
        Thread g = new Thread(girl);
        g.start();
        System.out.println("小亮开始排队打饭.....");
        g.join();
        SleepTools.second(2);//让主线程休眠2秒
        System.out.println(Thread.currentThread().getName() + " 小亮打饭完成.");
    }
}
