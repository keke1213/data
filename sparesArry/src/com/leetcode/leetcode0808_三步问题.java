package com.leetcode;

public class leetcode0808_三步问题 {
    public static void main(String[] args) {
        waysToStep(61);
    }
    public static int waysToStep(int n) {
        if (n<3)return n;
        int l=0,m=1,r=2,s=4;
        for (int i = 3; i < n; i++) {
            l=((m+r)%1000000007+s)%1000000007;
            m=r;
            r=s;
            s=l;
        }
        return s;
    }
}
