package com.leetcode;

public class leetcode1422_分割字符串最大分 {
    public static void main(String[] args) {
        maxScore("00");
    }
    public static int maxScore(String s) {
        int length = s.length();
        char[] chars = s.toCharArray();
        int zero=0;
        for (char c : s.toCharArray()) {
            if ('0' == c) {
                zero++;
            }
        }
        int one=length-zero;
        int max=0;
        int zeroCount=0,oneCount=one;
        for (int i = 0; i <chars.length-1 ; i++) {
            if (chars[i] == '0'){
                zeroCount++;
            }else {
                oneCount--;
            }
            max=Math.max(max,zeroCount+oneCount);

        }
        return max;
    }
}
