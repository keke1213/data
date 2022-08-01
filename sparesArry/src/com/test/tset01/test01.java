package com.test.tset01;

public class test01 {
    public static void main(String[] args) {
        area(new int[]{1,8,6,2,5,4,8,3,7});
    }

    private static int area(int[] arr){
        int length = arr.length;
        if (length<1)return 0;
        if (length<2)return arr[0];
        int left=0,right=length-1;
        int max=0;
        while (left<right){
            max=Math.max(max,(right-left)*Math.min(arr[left],arr[right]));
            if (arr[left]>arr[right]){
                right--;
            }else {
                left++;
            }
        }
        return max;
    }
}
