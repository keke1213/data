package com.leetcode.Exam01;

import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        minNumBooths(new String[]{"acd","bed","accd"});
    }
    public static int minNumBooths(String[] demand) {
        int[] letter = new int[26];
        int max = 0;
        for (String str : demand) {
            int[] newLetter = Arrays.copyOf(letter, 26);
            for (char c : str.toCharArray()) {
                if (newLetter[c-'a']==0){
                    newLetter[c-'a']++;
                } else {
                    newLetter[c-'a']--;
                }

            }
            int sum = Arrays.stream(newLetter).sum();
            if (max < sum) {
                letter = newLetter;
                max = sum;
            }
        }
        return max;
    }
}
