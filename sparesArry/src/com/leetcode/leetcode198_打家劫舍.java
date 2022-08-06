package com.leetcode;

public class leetcode198_打家劫舍 {
    public static void main(String[] args) {
        rob(new int[]{1,2,3,1});
    }
    public static int rob(int[] nums) {
        int p=0,q=0,max=0;
        for (int i=0;i<nums.length;i++){
            nums[i]=Math.max(p+nums[i],q);
            p=q;
            q=nums[i];
        }
        return nums[nums.length-1];
    }
}
