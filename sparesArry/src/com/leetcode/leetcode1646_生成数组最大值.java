package com.leetcode;

public class leetcode1646_生成数组最大值 {
    public static void main(String[] args) {
        getMaximumGenerated(1);
    }
    public static int getMaximumGenerated(int n) {
        if (n==0)return 0;

        int[] ints = new int[n + 1];
        ints[0]=0;
        ints[1]=1;
        int max=1;
        int i=1;
        while (i<n/2+1){
            if (2<=i*2&&i*2<=n){
                ints[i*2]=ints[i];
                max=Math.max(max,ints[i*2]);
            }
            if (2<=i*2+1&&i*2+1<=n){
                ints[i*2+1]=ints[i]+ints[i+1];
                max=Math.max(max,ints[i*2+1]);
            }
            i++;
        }
        return max;
    }
}
