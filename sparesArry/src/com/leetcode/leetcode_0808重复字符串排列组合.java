package com.leetcode;

import java.util.*;

public class leetcode_0808重复字符串排列组合 {
    public static void main(String[] args) {
        permutation("qqe");
    }
    //没做完
    public static String[] permutation(String S) {
        char[] chars = S.toCharArray();
        Arrays.sort(chars);
        boolean[] booleans = new boolean[chars.length];
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        dfs(chars,list,booleans,0,sb);
        String[] strings = new String[list.size()];
        for(int i=0;i<list.size();i++){
            strings[i]=list.get(i);
        }
        return  strings;
    }
    private static void dfs(char[] chars, List<String> list, boolean[] booleans, int index, StringBuilder sb) {
        if (chars.length==sb.length()){
            list.add(sb.toString());
            return;
        }

        booleans[index]=true;
        sb.append(chars[index]);
        dfs(chars,list,booleans,index,sb);
        booleans[index]=false;
        sb.deleteCharAt(sb.length()-1);
        dfs(chars,list,booleans,index,sb);
    }


}
