package com.chenyl.xiangxue.jvm;


import java.util.LinkedList;
import java.util.List;

/**
 * Title JstatDemo
 * Description
 * @author Chenyl
 * @date 2020/9/25 15:28
 *
 *
 *  1.实时查看GC
 *  jstat -gc  12766  1000  10
 *
 *
 *  1.系统不开启的时候  开启打印GC日志
 *  jinfo -flag +PrintGC 22188
 *
 *
 *   1.查看内存快照
 *   jmap -heap 14108
 *   2.查看内存中类型大小的排序
 *   jmap -histo:live 14108
 *   3.导出内存快照
 *   jmap -dump:live,format=b,file=D:\cyl.bin 14108
 *
 **/
public class JstatDemo {

    public static class FillListThread extends Thread{
        List<byte[]> list = new LinkedList<>();
        @Override
        public void run(){
            try{
                while(true){
                    if(list.size()*512/1024/1024>=990){
                        list.clear();
                        System.out.println("list is clear");
                    }
                    byte[] bl;
                    for (int i=0;i<100;i++){
                        bl = new byte[512];
                        list.add(bl);
                    }
                    Thread.sleep(1);
                }
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args){
        FillListThread thread = new FillListThread();
        thread.start();
    }
}
