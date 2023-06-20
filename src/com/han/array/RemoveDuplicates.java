package com.han.array;


/**
 * Description: 26. 删除有序数组中的重复项
 *              给你一个升序排列的数组 nums,
 *              请你原地删除重复出现的元素，使每个元素只出现一次,
 *              返回删除后数组的新长度。元素的相对顺序应该保持一致 。
 *              然后返回 nums中唯一元素的个数。考虑nums的唯一元素的数量为 k ，
 *              你需要做以下事情确保你的题解可以被通过：  更改数组nums，使 nums的前k个元素包含唯一元素，
 *              并按照它们最初在nums中出现的顺序排列。nums的其余元素与 nums的大小不重要。返回 k 。
 *              判题标准:  系统会用下面的代码来测试你的题解:
 *              int[] nums = [...]; // 输入数组
 *              int[] expectedNums = [...]; // 长度正确的期望答案
 *              int k = removeDuplicates(nums); // 调用
 *              assert k == expectedNums.length;
 *              for (int i = 0; i < k; i++) {
 *              assert nums[i] == expectedNums[i];
 *              } 如果所有断言都通过，那么您的题解将被 通过。
 *              输入：nums = [1,1,2]
 *              输出：2, nums = [1,2,_]
 *              解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。
 *              不需要考虑数组中超出新长度后面的元素。
 *
 * Author: Han
 * Date: 2023/6/20 11:08
 **/
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        System.out.println(RemoveDuplicates.removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums){
        int left = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1]!=nums[i]){
                nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }
}
