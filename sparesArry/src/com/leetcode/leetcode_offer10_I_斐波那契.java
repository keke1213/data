package com.leetcode;

public class leetcode_offer10_I_斐波那契 {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n) {
        int q=0,p=0,r=1;
        for (int i = 2; i <= n; i++) {
            p=q;
            q=r;
            r=(p+q)%1000000007;
        }
        return r;
    }
}
