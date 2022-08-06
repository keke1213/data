package com.leetcode;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
import java.util.Set;

public class leetcode187_重复的DNA {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1",1);
        Integer orDefault = map.getOrDefault("1", 0);//获取默认值 如果未设置则为设置的默认值
        System.out.println(map);
        System.out.println(orDefault);
//        findRepeatedDnaSequences1("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        findRepeatedDnaSequences1("AAAAAAAAAAA");
    }
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        int n = s.length();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i + 10 <= n; i++) {
            String cur = s.substring(i, i + 10);
            int cnt = map.getOrDefault(cur, 0);
            if (cnt == 1) ans.add(cur);
            map.put(cur, cnt + 1);
        }
        return ans;
    }

    public static List<String> findRepeatedDnaSequences1(String s) {
        int length = s.length();
        List<String > list=new ArrayList<>();
        if (length<10)return list;
        HashMap<String, Integer> hashMap=new HashMap<>();
        for (int i=0;i<length-9;i++){
            String substring = s.substring(i, i + 10);
            Integer orDefault = hashMap.getOrDefault(substring, 0);
            if (orDefault==1){
                list.add(substring);
                hashMap.put(substring,orDefault+1);
            }
            hashMap.put(substring,orDefault+1);
        }
        return list;
    }
}
