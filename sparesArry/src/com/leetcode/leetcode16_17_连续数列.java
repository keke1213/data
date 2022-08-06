package com.leetcode;

public class leetcode16_17_连续数列 {
    public static void main(String[] args) {
//        maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
//        maxSubArray(new int[]{-1});
        maxSubArray(new int[]{-2,-1});
    }
    public static int maxSubArray(int[] nums) {
        if (nums==null)return 0;
        int length = nums.length;
        if (length<2)return nums[0];
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            sum = sum + nums[i];
            max=Math.max(max,sum);
            if (sum<0){
                sum=0;
                continue;
            }

        }
        return max;
    }
}
