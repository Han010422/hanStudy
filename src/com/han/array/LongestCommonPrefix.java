package com.han.array;

/**
 * Description: 14. 最长公共前缀
 *              编写一个函数来查找字符串数组中的最长公共前缀。  如果不存在公共前缀，返回空字符串 ""。
 * Author: Han
 * Date: 2023/5/17 15:54
 **/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = new String[]{"flower","flow","flight"};
        Solution14 solution14 = new Solution14();
        System.out.println(solution14.longestCommonPrefix(str));
    }
}

class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        String commonStr = "";
        for(int i=0;i<strs[0].length();i++){
            char c = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>strs[j].length()){
                    return commonStr;
                }else if(c!=strs[j].charAt(i)){
                    return commonStr;
                }
            }
            commonStr=commonStr+c;
        }
        return commonStr;
    }
}