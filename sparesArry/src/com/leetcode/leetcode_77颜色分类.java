package com.leetcode;

public class leetcode_77颜色分类 {
    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
    }
    //计数法
    public static void sortColors(int[] nums) {
       int[] arr =new int[3];
        for (int num : nums) {
            arr[num]++;
        }
        int index=0;
        for (int i=0;i<arr[0];i++){
            nums[i]=0;
        }
        for (int i=0;i<arr[1];i++){
            nums[i+arr[0]]=1;
        }
        for (int i=0;i<arr[2];i++){
            nums[i+arr[0]+arr[1]]=2;
        }
        System.out.println();
    }
}
