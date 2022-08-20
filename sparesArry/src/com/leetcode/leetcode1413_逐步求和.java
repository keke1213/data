package com.leetcode;

public class leetcode1413_逐步求和 {
    public static void main(String[] args) {
        minStartValue(new int[]{-3,2,-3,4,2});
    }
    public static int minStartValue(int[] nums) {
        int length = nums.length;
        boolean flag = true;
        int startValue ;
        int temp = 1;
        while (flag){
            startValue = temp ;
            for (int i = 0; i < length; i++) {
                startValue += nums[i];
                if (startValue<1){
                    temp++;
                    flag=true;
                    break;
                }
                flag=false;
            }


        }

        return temp;

    }
}
