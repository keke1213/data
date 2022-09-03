package com.leetcode;

import java.util.Arrays;

public class LeetCode1464 {
    public int maxProduct1(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        return (nums[length-1] - 1) * (nums[length-2] - 1);
    }
    public int maxProduct(int[] nums) {
        int cur = Integer.MIN_VALUE;
        int per = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > per) {
                cur = per;
                per = nums[i];
            }
            else if (nums[i] > cur) {
                cur = nums[i];
            }

        }
        return  (cur - 1) * (per - 1);
    }
}
