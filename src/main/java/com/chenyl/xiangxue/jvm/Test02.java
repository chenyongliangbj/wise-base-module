package com.chenyl.xiangxue.jvm;


import java.util.ArrayList;
import java.util.List;

/**
 * Title Test02
 * Description
 * @author Chenyl
 * @date 2020/9/12 11:26
 *
 *
 *
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 **/
public class Test02 {
    public static void main(String[] args) {

        List<Test02> list = new ArrayList<>();
        while(true){
            list.add(new Test02());
        }
    }
}
