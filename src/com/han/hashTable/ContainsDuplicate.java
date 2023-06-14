package com.han.hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 217. 存在重复元素
 *              给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；
 *              如果数组中每个元素互不相同，返回 false
 *              输入：nums = [1,2,3,1]
 *              输出：true
 * Author: Han
 * Date: 2023/5/17 17:15
 **/
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        System.out.println(ContainsDuplicate.containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0 ;i<nums.length;i++){
            if(map.get(nums[i])!=null){
                return true;
            }else {
                map.put(nums[i],1);
            }
        }
        return false;
    }
}