package com.chenyl.module.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * @author Chenyl
 * @date 2019/9/5 18:51
 **/
public class test0001 {


    public int[] twoSum1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(i+j == target){
                    return new int[]{i,j};
                }
            }
        }
        throw  new IllegalArgumentException("No two sum solution");
    }


    public int[] twoSum2(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {

            int temp = target - nums[i];

            if(map.containsKey(temp) && map.get(temp) != i){
                return new int[]{i,map.get(temp)};
            }
        }
        throw  new IllegalArgumentException("No two sum solution");
    }
}

