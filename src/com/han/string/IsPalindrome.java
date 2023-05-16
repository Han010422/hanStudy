package com.han.string;

/**
 * Description: 9. 回文数
 *              给你一个整数 x，如果 x 是一个回文整数，返回 true；否则，返回 false
 *              回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
 *              例如，121 是回文，而 123 不是
 *              输入：x = -121
 *              输出：false
 *              解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * Author: Han
 * Date: 2023/5/16 15:37
 **/
public class IsPalindrome {
    public static void main(String[] args) {
        int num = -123321;
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.isPalindrome(num));
    }
}
class Solution9 {
    public boolean isPalindrome(int x) {
        boolean b = true;
        if(x<0){
            b=false;
        }else {
              String str = x+"";
              for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--){
                  if(str.charAt(i)!=str.charAt(j)){
                      b=false;
                      break;
                  }
              }
        }
        return b;
    }
}