package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode22 {
    public static void main(String[] args) {
        generateParenthesis(3);
    }
    public static List<String> generateParenthesis(int n) {
        int length=n*2;
        StringBuilder stringBuilder=new StringBuilder();
        List<String>  list=new ArrayList<>();
        int left=0,right=0;
        dfs(stringBuilder,left,right,length,list);
        return list;
    }
    public static void dfs(StringBuilder stringBuilder, int left, int right, int length, List<String> list){
            if (stringBuilder.length()==length){
                list.add(stringBuilder.toString());
                return;
            }
            if (left<length/2){
                stringBuilder.append("(");
                dfs(stringBuilder,left+1,right,length,list);
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }
            if (right<left){
                stringBuilder.append(")");
                dfs(stringBuilder,left,right+1,length,list);
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }

    }
}
