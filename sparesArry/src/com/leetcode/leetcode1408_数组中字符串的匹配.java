package com.leetcode;

import java.util.*;

public class leetcode1408_数组中字符串的匹配 {
    public static void main(String[] args) {
        stringMatching(new String[]{"mass","as","hero","superhero"});
    }
    public static List<String> stringMatching(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        List<String> list=new ArrayList<>();
        HashSet<String > hashSet = new HashSet<>();
        int length = words.length;
        if (length<2){
            return list;
        }
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                if (words[i].contains(words[j])){
                    hashSet.add(words[j]);
                }
            }
        }
        list=new ArrayList<>(hashSet);

        return list;
    }
}
