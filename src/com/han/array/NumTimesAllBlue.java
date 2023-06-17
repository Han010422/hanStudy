package com.han.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 1375. 二进制字符串前缀一致的次数
 *              给你一个长度为 n 、下标从 1 开始的二进制字符串，所有位最开始都是 0 。
 *              我们会按步翻转该二进制字符串的所有位（即，将 0 变为 1）。
 *              给你一个下标从 1 开始的整数数组 flips，其中 flips[i] 表示对应下标 i 的位将会在第 i 步翻转。
 *              二进制字符串 前缀一致 需满足：在第 i 步之后，在 闭 区间 [1, i] 内的所有位都是 1，而其他位都是0
 *              返回二进制字符串在翻转过程中 前缀一致 的次数。
 *              输入：flips = [3,2,4,1,5]
 *              输出：2
 *              解释：二进制字符串最开始是 "00000" 。
 *              执行第 1 步：字符串变为 "00100" ，不属于前缀一致的情况。
 *              执行第 2 步：字符串变为 "01100" ，不属于前缀一致的情况。
 *              执行第 3 步：字符串变为 "01110" ，不属于前缀一致的情况。
 *              执行第 4 步：字符串变为 "11110" ，属于前缀一致的情况。
 *              执行第 5 步：字符串变为 "11111" ，属于前缀一致的情况。
 *              在翻转过程中，前缀一致的次数为 2 ，所以返回 2 。
 *
 * Author: Han
 * Date: 2023/6/14 14:14
 **/
public class NumTimesAllBlue {
    public static void main(String[] args) {
        int[] flips = new int[]{4,1,2,3};
        System.out.println(NumTimesAllBlue.numTimesAllBlue(flips));
    }

    private static int numTimesAllBlue(int[] flips) {
        Map<Integer,Integer> map = new HashMap<>();
        int result = 0;
        int count = 1;
        for(int i = 0; i < flips.length; i++){
            map.put(flips[i],1);
            if(flips[i] <= i + 1){
                count = getValue(count, map);
                if(count>=flips[i] && i+1==count){
                    result++;
                }
            }
        }
        return result;
    }

    private static int getValue(int count,Map<Integer,Integer> map){
        while(map.get(count)!= null){
            count++;
        }
        return count>1?count-1:count;
    }
}
