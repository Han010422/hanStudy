package com.han.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * Description: 1. 两数之和
 *              给定一个整数数组 nums 和一个整数目标值 target,
 *              请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
 *              你可以假设每种输入只会对应一个答案。但是,数组中同一个元素在答案里不能重复出现。
 *              你可以按任意顺序返回答案
 *              输入：nums = [2,7,11,15], target = 9
 *              输出：[0,1]
 *              解释：因为 nums[0] + nums[1] == 9 ,返回 [0, 1]
 * Author: Han
 * Date: 2023/5/9 9:58
 **/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(TwoSum.twoSum(nums,target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        //将数组的值作为key下标作为value存入map，遍历数组同时查找map中有无与当前数组元素相加等于target的key
        //若有直接返回当前数组下标和map中存的下标，若无将当前数组的值作为key下标作为value存入map
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(map.get(target-nums[i])!=null){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}