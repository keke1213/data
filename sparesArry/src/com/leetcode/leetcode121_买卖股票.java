package com.leetcode;

public class leetcode121_买卖股票 {
    public static void main(String[] args) {
        maxProfit(new int[]{7,1,5,3,6,4});
    }
    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=-1;
        int length = prices.length;
        for (int i = 0; i < length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }
}
