package com.leetcode;

public class leetcode_按摩师问题 {
    //跟小偷一样
    public static void main(String[] args) {
//        massage(new int[]{2,7,9,3,1});
        massage(new int[]{1,2,3,1});
//        massage(new int[]{2,1,4,5,3,1,1,3});
    }
    public static int massage(int[] nums) {
        if (nums.length==0)return 0;
        int p=0,q=0;
        for (int i=0;i<nums.length;i++){
            nums[i]=Math.max(q,p+nums[i]);
            p=q;
            q=nums[i];
        }
        return nums[nums.length-1];
    }
}
