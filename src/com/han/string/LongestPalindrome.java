package com.han.string;

/**
 * Description: 5. 最长回文子串
 *              给你一个字符串 s，找到 s 中最长的回文子串
 *              如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
 *              输入：s = "babad"
 *              输出："bab"
 *              解释："aba" 同样是符合题意的答案。
 * Author: Han
 * Date: 2023/5/25 11:03
 **/
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(LongestPalindrome.longestPalindrome(s));
    }

    private static String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int startIndex=0;
        int len = 1;
        int left = 0;
        int right = 0;
        int strLength=0;
        String[] split = s.split("");
        for(int i=0;i<split.length-1;i++){
            left=i;
            right=left+2;
            while(left>=0 && right<split.length && split[left].equals(split[right])){
                len=len+2;
                left--;
                right++;
            }
            if(strLength<len){
                strLength=len;
                startIndex=left+1;
            }
            len=1;
        }
        for(int i=0;i<split.length-1;i++){
            len=0;
            left=i;
            right=left+1;
            while(left>=0 && right<split.length && split[left].equals(split[right])){
                len=len+2;
                left--;
                right++;
            }
            if(strLength<len){
                strLength=len;
                startIndex=left+1;
            }
            len=0;
        }
        return s.substring(startIndex, startIndex+strLength);
    }
}