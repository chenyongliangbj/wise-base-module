package com.chenyl.module.leetcode;

import java.util.*;

/**
 *
 * 排排坐，分糖果。
 *
 * 我们买了一些糖果 candies，打算把它们分给排好队的 n = num_people 个小朋友。
 *
 * 给第一个小朋友 1 颗糖果，第二个小朋友 2 颗，依此类推，直到给最后一个小朋友 n 颗糖果。
 *
 * 然后，我们再回到队伍的起点，给第一个小朋友 n + 1 颗糖果，第二个小朋友 n + 2 颗，依此类推，直到给最后一个小朋友 2 * n 颗糖果。
 *
 * 重复上述过程（每次都比上一次多给出一颗糖果，当到达队伍终点后再次从队伍起点开始），直到我们分完所有的糖果。注意，就算我们手中的剩下糖果数不够（不比前一次发出的糖果多），这些糖果也会全部发给当前的小朋友。
 *
 * 返回一个长度为 num_people、元素之和为 candies 的数组，以表示糖果的最终分发情况（即 ans[i] 表示第 i 个小朋友分到的糖果数）。
 *
 * @author Chenyl
 * @date 2020/3/5 16:15
 **/
public class leet002 {

    public static int[] distributeCandies(int candies, int num_people) {

        int[] ans = new int[num_people];


        //队列中小朋友的标号，取出一个小朋友分糖，判断
        Queue<Integer> queue = new LinkedList<>();

        //1.把所有小朋友排好队
        for (int i = 0; i < num_people; i++) {
            queue.add(i);
        }
        //分发的糖
        int fenNum = 1;
        //2.排队分糖
        while(candies > 0){
            int num = queue.remove();
            if(candies - fenNum <= 0){
                ans[num] += candies;
                candies = 0;
            }else{
                candies = candies - fenNum;
                ans[num] += fenNum;
            }
            fenNum++;
            queue.add(num);
        }
        return ans;
    }


    public int[] distributeCandies2(int candies, int num_people) {

        int curr_give = 0;
        int[] res = new int[num_people];

        while (candies > 0) {

            res[curr_give % num_people] += Math.min(++curr_give, candies);
            candies -= curr_give;
        }

        return res;
    }


    public static void main(String[] args) {

//       int candies = 7, num_people = 4;
        int candies = 10, num_people = 3;
        int[] ans =  distributeCandies(candies,num_people);
        System.out.println(ans);
    }

}
