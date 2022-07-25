package com.leetcode;

public class DevideSearch704 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }
    public static int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]>target){
                j=mid-1;
            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
