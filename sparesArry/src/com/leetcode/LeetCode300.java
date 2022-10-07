package com.leetcode;

import java.util.LinkedList;

public class LeetCode300 {
    public static void main(String[] args) {
        lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});
    }
    public static int lengthOfLIS(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(nums[0]);
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            int num = list.peekLast(); //尾巴
            if (num < nums[i]) {
                list.add(nums[i]);
                max = Math.max(max,list.size());
            } else {
                while (!list.isEmpty() && num > nums[i]) {
                    list.poll();
                    num = list.peekLast();
                }
            }
        }
        return max;
    }
}
