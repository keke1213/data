package com.leetcode;

public class LeetCode1455Ease {
    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] split = sentence.split(" ");
        int wordLength = searchWord.length();
        for (int i = 0; i < split.length; i++) {
            int length = split[i].length();
            if (wordLength <= length) {
                int j = 0;
                for (; j < wordLength; j++) {
                    if (split[i].charAt(j) != searchWord.charAt(j)) {
                        break;
                    }
                }
                if (j == wordLength) {
                    return i+1;
                } else {
                    j = 0;
                }
            }
        }
        return -1;
    }
}
