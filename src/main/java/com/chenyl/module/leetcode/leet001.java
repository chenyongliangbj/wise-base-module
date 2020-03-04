package com.chenyl.module.leetcode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * 在给定的网格中，每个单元格可以有以下三个值之一：
 *
 * 值 0 代表空单元格；
 * 值 1 代表新鲜橘子；
 * 值 2 代表腐烂的橘子。
 * 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。
 *
 * 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1
 *
 * 输入：[[2,1,1],[1,1,0],[0,1,1]]
 * 输出：4
 *
 * @author Chenyl
 * @date 2020/3/4 10:17
 **/
public class leet001 {


    public static int orangesRotting(int[][] grid) {

        //设置步数：
        int step = 0;

        //1.找出所有坏的橘子，放入到队列中

        //矩形的宽、高
        int width = grid.length;
        int high = grid[0].length;
        System.out.println("width:"+width+" high:"+high);

        Queue<Integer> queue = new ArrayDeque<>();
        Map<Integer,Integer> depth = new HashMap<>();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < high; j++) {
                if(grid[i][j] == 2){  //二维的长度：把二维变换成一维
                    int len = i+j*width;
                    queue.add(len);
                    depth.put(len,0);
                }
            }
        }

        //2.腐坏所有好橘子过程,遍历上下左右四个方向是否有好橘子（1）
        while(!queue.isEmpty()){

            //橘子的地点，转换成二维坐标
            int len = queue.remove();
            int x = len%width;
            int y = len/width;


            //上：(x,y-1) 下：（x,y+1） 左：（x-1,y）右:(x+1,y)
            if(y-1 >= 0 && grid[x][y-1] == 1){
                grid[x][y-1] = 2;

                int length = x+(y-1)*width;
                queue.add(length);
                depth.put(length,depth.get(len)+1);
                step = depth.get(length);
            }
            if(y+1<high && grid[x][y+1] == 1){
                grid[x][y+1] = 2;

                int length = x+(y+1)*width;
                queue.add(length);
                depth.put(length,depth.get(len)+1);
                step = depth.get(length);
            }
            if(x-1>=0 && grid[x-1][y] == 1){
                grid[x-1][y] = 2;

                int length = (x-1)+y*width;
                queue.add(length);
                depth.put(length,depth.get(len)+1);
                step = depth.get(length);
            }
            if(x+1<width && grid[x+1][y] == 1){
                grid[x+1][y] = 2;
                int length = (x+1)+y*width;
                queue.add(length);
                depth.put(length,depth.get(len)+1);
                step = depth.get(length);
            }
        }


        //3.判断所有橘子是否存在等于1的，存在返回-1，不存在返回步数。
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < high; j++) {
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }

        return step;
    }




    public static void main(String[] args) {

//        int[][] origin = {{2,1,1},{1,1,0},{0,1,1}};  //4
//        int[][] origin = {{1,2}};
//        int[][] origin = {{0,2}};
        int[][] origin = {{2,2},{1,1},{0,0},{2,0}};
        System.out.println(orangesRotting(origin));

    }
}
