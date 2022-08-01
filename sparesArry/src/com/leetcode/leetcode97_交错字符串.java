package com.leetcode;

public class leetcode97_交错字符串 {
    public static void main(String[] args) {
        //s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
//        isInterleave("aabcc","dbbca","aadbbcbcac");
        isInterleave("","","");

    }
    public static boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length()+s2.length()!=s3.length())return false;
        int s1len = s1.length()+1;
        int s2len = s2.length()+1;
        boolean[][] status=new boolean[s1len][s2len];
        status[0][0]=true;
        // 第一列赋值
        for (int i=1;i<s1len;i++){
            status[i][0]=status[i-1][0]&&s1.charAt(i-1)==s3.charAt(i-1);
        }
        //第一行赋值
        for (int i=1;i<s2len;i++){
            status[0][i]=status[0][i-1]&&s2.charAt(i-1)==s3.charAt(i-1);
        }
        for (int i=1;i<s1len;i++){
            for (int j=1;j<s2len;j++){
                if (status[i-1][j]&&s1.charAt(i-1)==s3.charAt(i+j-1)||
                        status[i][j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1)){
                    status[i][j]=true;
                }
            }
        }
        return status[s1len-1][s2len-1];
    }
}
