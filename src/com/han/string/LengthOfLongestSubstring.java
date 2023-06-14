package com.han.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 3. 无重复字符的最长子串
 *              给定一个字符串 s ,请你找出其中不含有重复字符的最长子串的长度。
 *              输入: s = "abcabcbb"
 *              输出: 3
 *              解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * Author: Han
 * Date: 2023/5/10 14:21
 **/
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "zwnigfunjwz";
        System.out.println(LengthOfLongestSubstring
                .lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        //记录当前末尾字符
        char c = '\u0000';
        //记录重复节点
        int repeatedNodeIndex = 0;
        //记录每个子串，与结果子串比较，结果子串永远记录最长的长度
        int substring = 0;
        //记录最长重复子串长度
        int resultLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))!=null){
                if(c==s.charAt(i)){
                    repeatedNodeIndex=map.get(s.charAt(i));
                    map.put(s.charAt(i),i);
                    substring=1;
                }else {
                    if(map.get(s.charAt(i))<repeatedNodeIndex){
                        substring = i-repeatedNodeIndex;
                    }else {
                        substring = i-map.get(s.charAt(i));
                    }
                    repeatedNodeIndex=repeatedNodeIndex>map.get(s.charAt(i))?repeatedNodeIndex:map.get(s.charAt(i));
                    map.put(s.charAt(i),i);
                    c=s.charAt(i);
                }
            }else {
                substring=substring+1;
                c=s.charAt(i);
                map.put(s.charAt(i),i);
            }
            resultLength=resultLength>substring?resultLength:substring;
        }
        return resultLength;
    }
}