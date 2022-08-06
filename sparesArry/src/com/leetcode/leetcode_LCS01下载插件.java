package com.leetcode;

public class leetcode_LCS01下载插件 {
    public static void main(String[] args) {
//        System.out.println(1 << 1);
        leastMinutes(4);
    }
    public static int leastMinutes(int n) {
        if (n<4)return n;
        int index=1;
        int value=1;//当前带宽
        int shen=0;
        int round=1;
        while (true){
            round++;
            value=value<<index;
            shen=n-value;
            if (value>=shen){
                round++;
                break;
            }
        }
        return round;
    }
}
