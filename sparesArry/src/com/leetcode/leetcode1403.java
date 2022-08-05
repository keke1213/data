package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode1403 {
    public static void main(String[] args) {
//        minSubsequence(new int[]{4,3,10,9,8});
//        minSubsequence(new int[]{4,4,7,6,7});
//        minSubsequence(new int[]{8,8});
        minSubsequence(new int[]{8,7});
    }
    public static List<Integer> minSubsequence(int[] nums) {
        int length = nums.length;
        List<Integer> list=new ArrayList<>();
        if (length == 1) {
            list.add(nums[0]);
            return list;
        }
//        if (length == 2) {
//            list.add(Math.max(nums[0],nums[1]));
//            return list;
//        }
        int sum=0;
        for (int i = 0; i < length; i++) {
            sum+=nums[i];
        }
        Arrays.sort(nums);
        int value=0;
        for (int i = length-1; i >= 0 ; i--) {
            if (sum>=value){
                value+=nums[i];
                list.add(nums[i]);
                sum-=nums[i];
            }else {
                break;
            }
        }
        return list;
    }
}
