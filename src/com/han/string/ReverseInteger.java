package com.han.string;

/**
 * Description: 7. 整数反转
 *              给你一个32位的有符号整数 x，返回将 x中的数字部分反转后的结果
 *              如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1]，就返回 0
 *              假设环境不允许存储 64 位整数（有符号或无符号）
 *              输入：x = 123
 *              输出：321
 * Author: Han
 * Date: 2023/5/16 14:07
 **/
public class ReverseInteger {
    public static void main(String[] args) {
        int num = -123;
        System.out.println(ReverseInteger.reverse(num));
    }

    private static int reverse(int x) {
        String str1 = x>0?x+"":(x+"").substring(1);
        String str2 = "";
        for(int i=str1.length()-1;i>=0;i--){
            str2 = str2+str1.charAt(i);
        }
        int num = 0;
        try{
            if(x>0){
                num = Integer.valueOf(str2);
            }else {
                num = 0-Integer.valueOf(str2);
            }

        }catch (NumberFormatException e){
            return 0;
        }
        return num;
    }
}