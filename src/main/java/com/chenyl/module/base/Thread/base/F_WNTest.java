package com.chenyl.module.base.Thread.base;

/**
 * 类说明：测试wait/notify/notifyAll
 *
 * wait/notify实现生产者和消费者程序
 *
 * 采用多线程技术，射击实现一个符合生产者和消费者问题的程序，对某一个对象（枪膛）进行操作，其最大容量是20颗子弹，
 * 生产者线程是一个压入线程，它不断向枪膛压入子弹，消费者线程是一个射出线程，它不断从枪膛中射出子弹
 */
public class F_WNTest {


    private static Gun gun = new Gun(0,20);


    private static class CheckNum extends  Thread{
        @Override
        public void run(){
            gun.Shoot();
        }

    }
    private static class PressIn extends  Thread{
        @Override
        public void run(){
            gun.PressIn();
        }

    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 50 ; i++) {
            new PressIn().start();
        }

        for (int i = 0; i < 50; i++) {
            new CheckNum().start();
        }
    }

}
