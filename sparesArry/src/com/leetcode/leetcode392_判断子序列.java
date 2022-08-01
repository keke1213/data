package com.leetcode;

public class leetcode392_判断子序列 {
    public static void main(String[] args) {

    }
    public boolean isSubsequence(String s, String t) {
        int length = t.length();
        int sL = s.length();
        if (sL==0)return true;
        if (length<sL)return false;
//        boolean[] st=new boolean[length];
        int index=0;
        for (char c : t.toCharArray()) {
            if (s.charAt(index)==c) {
                index++;
                if (index==sL)return true;
            }

        }
        return index==sL;
    }
}
