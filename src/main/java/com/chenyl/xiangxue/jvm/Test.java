package com.chenyl.xiangxue.jvm;

public class Test {

    /**
     *
         字节码:https://cloud.tencent.com/developer/article/1333540

     *   操作数栈、局部变量表
     *   public static void main(java.lang.String[]);
     *     Code:
     *        0: iconst_3
     *        1: istore_1
     *        2: iconst_2
     *        3: istore_2
     *        4: iload_1
     *        5: iload_2
     *        6: iadd
     *        7: bipush        10
     *        9: imul
     *       10: istore_3
     *       11: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *       14: iload_3
     *       15: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
     *       18: return
     **/

    public static void main(String[] args){

        int a= 3;
        int b = 2;
        int c = (a+b)*10;

        System.out.println(c);
    }
}
