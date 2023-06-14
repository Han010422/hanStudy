package com.han.array;
/**
 * Description: 2.两数相加
 *              给你两个非空的链表，表示两个非负的整数。
 *              它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *              请你将两个数相加，并以相同形式返回一个表示和的链表
 *              你可以假设除了数字 0之外，这两个数都不会以 0开头
 *              输入：l1 = [2,4,3], l2 = [5,6,4]
 *              输出：[7,0,8]
 *              解释：342 + 465 = 807.
 * Author: Han
 * Date: 2023/5/9 14:36
 **/
public class AddTwoNumbers {
    public static void main(String[] args) {
        String nums1 = "942";
        String nums2 = "9465";
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        for (int i = 1; i <= nums1.length(); i++) {
            if(i<=1){
                listNode1 = new ListNode(Integer.valueOf(nums1.substring(i-1,i)),null);
            }else {
                listNode1 = new ListNode(Integer.valueOf(nums1.substring(i-1,i)),listNode1);
            }
        }
        for (int i = 1; i <= nums2.length(); i++) {
            if(i<=1){
                listNode2 = new ListNode(Integer.valueOf(nums2.substring(i-1,i)),null);
            }else {
                listNode2 = new ListNode(Integer.valueOf(nums2.substring(i-1,i)),listNode2);
            }
        }
        ListNode listNode = AddTwoNumbers.addTwoNumbers(listNode1, listNode2);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String nums1= "";
        String nums2= "";
        while (l1.next != null){
            nums1=nums1+l1.val;
            l1 = l1.next;
        }
        nums1=nums1+l1.val;
        while (l2.next != null){
            nums2=nums2+l2.val;
            l2 = l2.next;
        }
        nums2=nums2+l2.val;
        String nums3 = AddTwoNumbers.add(new StringBuilder(nums1).reverse().toString(),new StringBuilder(nums2).reverse().toString());
        ListNode listNode = new ListNode();
        for (int i = 1; i <= nums3.length(); i++) {
            if(i<=1){
                listNode = new ListNode(Integer.valueOf(nums3.substring(i-1,i)),null);
            }else {
                listNode = new ListNode(Integer.valueOf(nums3.substring(i-1,i)),listNode);
            }
        }
        return listNode;
    }

    private static String add(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = len1 - 1, j = len2 - 1; i >= 0 || j >= 0 || carry != 0; i--, j--) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = x + y + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}