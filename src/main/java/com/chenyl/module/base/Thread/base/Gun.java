package com.chenyl.module.base.Thread.base;

public class Gun {

    private static int num;

    private static int maxNum;

    Gun(int num, int maxNum){
        this.num = num;
        this.maxNum = maxNum;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Gun.num = num;
    }

    public static int getMaxNum() {
        return maxNum;
    }

    public static void setMaxNum(int maxNum) {
        Gun.maxNum = maxNum;
    }


    public synchronized void PressIn(){
        System.out.println("准备压入子弹……");

        while(num == maxNum){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        num++;
        if(num > 0){
            System.out.println("当前子弹数量："+num+" 通知射击……");
            notify();
        }

    }

    public synchronized void Shoot() {
            System.out.println(Thread.currentThread().getName()+" 准备射击……");

            while (num == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            num--;
            if(num < maxNum){
                notify();
            }
            System.out.println(Thread.currentThread().getName()+" 射击……"+num);
        }
}
