package com.leetcode;

public class leetcode11_成最多水容器 {
    public static void main(String[] args) {
        maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }
    public static int maxArea(int[] height) {
        int length = height.length;
        int left=0;
        int right=length-1;
        int max=0;
        while (left<right){
            max=Math.max(max,Math.min(height[left],height[right])*(right-left));
            if (height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return max;
    }
}
