package com.han.array;

/**
 * Description: 4. 寻找两个正序数组的中位数
 *              给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2
 *              请你找出并返回这两个正序数组的中位数
 *              算法的时间复杂度应该为 O(log (m+n))
 *              输入：nums1 = [1,2], nums2 = [3,4]
 *              输出：2.50000
 *              解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 * Author: Han
 * Date: 2023/5/13 14:53
 **/
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int []nums1 = new int[]{1,2};
        int []nums2 = new int[]{3,4};
        Solution4 solution4 = new Solution4();
        double medianSortedArrays = solution4.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}

class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[(nums1.length+nums2.length)/2+1];
        int i=0,j=0;
        for(int z=0;z<result.length;z++){
            if(i>nums1.length-1){
                result[z]=nums2[j];
                j++;
            }else {
                if(j>nums2.length-1){
                    result[z]=nums1[i];
                    i++;
                }else {
                    if(nums1[i]>nums2[j]){
                        result[z]=nums2[j];
                        j++;
                    }else {
                        result[z]=nums1[i];
                        i++;
                    }
                }
            }
        }
        return (nums1.length+nums2.length)%2==0?(result[result.length-2]+result[result.length-1])/2.0:result[result.length-1]/1.0;
    }
}