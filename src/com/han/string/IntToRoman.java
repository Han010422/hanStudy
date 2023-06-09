package com.han.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 12. 整数转罗马数字
 *              罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 *              字符-数值 I1 V5 X10 L50 C100 D500 M1000
 *              例如,罗马数字2写做 II,即为两个并列的 1。12 写做 XII,即为 X + II
 *              27 写做  XXVII, 即为 XX + V + II 。
 *              通常情况下，罗马数字中小的数字在大的数字的右边。
 *              但也存在特例，例如 4 不写做 IIII，而是 IV。
 *              数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 *              同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *              I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 *              X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 *              C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 *              给你一个整数，将其转为罗马数字
 *              输入: num = 1994
 *              输出: "MCMXCIV"
 *              解释: M = 1000, CM = 900, XC = 90, IV = 4.
 * Author: Han
 * Date: 2023/5/17 14:23
 **/
public class IntToRoman {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(IntToRoman.intToRoman(num));
    }

    private static String intToRoman(int num) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(6,"VI");
        map.put(7,"VII");
        map.put(8,"VIII");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(20,"XX");
        map.put(30,"XXX");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(60,"LX");
        map.put(70,"LXX");
        map.put(80,"LXXX");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(200,"CC");
        map.put(300,"CCC");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(600,"DC");
        map.put(700,"DCC");
        map.put(800,"DCCC");
        map.put(900,"CM");
        map.put(1000,"M");
        map.put(2000,"MM");
        map.put(3000,"MMM");
        String numStr = num+"";
        String result="";
        int[] nums = new int[numStr.length()];
        for(int i = nums.length-1;i>=0;i--){
            if(Integer.valueOf(numStr.charAt(numStr.length() - 1 - i) + "")==0){
                continue;
            }
            result = result + map.get((int) Math.pow(10, i)* Integer.valueOf(numStr.charAt(numStr.length() - 1 - i) + ""));
        }
        return result;
    }
}