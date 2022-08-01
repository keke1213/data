package com.leetcode;

public class leetcode_offer10_II_青蛙跳台阶 {
    public static void main(String[] args) {

    }
    public int numWays(int n) {
        int p=0,q=0,r=1;
        for (int i=0;i<n;i++){
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
