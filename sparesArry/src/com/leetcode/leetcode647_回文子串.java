package com.leetcode;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class leetcode647_回文子串 {
    public static void main(String[] args) {
        countSubstrings1("aaaaa");


    }

    public static int countSubstrings(String s) {
        int length = s.length();
        boolean[][] booleans = new boolean[length][length];
        int count=length;
        for (int i = 0; i < length; i++) {
            booleans[i][i]=true;
        }
        for (int i = 1; i <length ; i++) {
            for (int j=0;j<i;j++){
                char c = s.charAt(i);
                char c1 = s.charAt(j);
                if (c==c1&&i-j<3||c==c1&&booleans[j+1][i-1]){
                    count++;
                    booleans[j][i]=true;
                }
            }
        }
        return count;
    }
    static int  num = 0;

    public static int countSubstrings1(String s) {
        for (int i=0; i < s.length(); i++){
            count(s, i, i);//回文串长度为奇数
            count(s, i, i+1);//回文串长度为偶数
        }
        return num;
    }

    public static void count(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            num++;
            start--;
            end++;
        }
    }

}
