package com.leetcode;

import java.util.Arrays;

public class leetcode322_零钱兑换 {
    public static void main(String[] args) {
//        coinChange(new int[]{1, 2, 5},11);
        coinChange(new int[]{186,419,83,408},6249);
    }
    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count=0;
        int length = coins.length;
        for (int i = length-1; i >=0 ; i--) {
            if (coins[i]<=amount){
                amount-=coins[i];
                count++;
                ++i;
            }else {
                continue;
            }
        }
        return amount==0?count:-1;
    }
}
