package com.leetcode.Exam01;

public class Fore {
    public static void main(String[] args) {

    }
    public int Leetcode(String[] words) {
        int[] letter = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
//                if (letter[c-'a'])
                letter[c-'a']++;
            }
            int left = 0;
            int right = word.length()-1;
            while (left < right) {
                if (letter[left]>1){

                }
                if (letter[right]>1){

                }
            }
        }
        return 0;
    }
}
