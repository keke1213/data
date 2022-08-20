package com.leetcode;

public class leetcode1417_重新格式化 {
    public static void main(String[] args) {
//        System.out.println(Character.isLetterOrDigit('1'));
//        System.out.println(Character.isLetterOrDigit('a'));
//        System.out.println(Character.isLetterOrDigit('-'));
        reformat("a0b1c2");
    }
    public static String reformat(String s) {
        char[] chars = s.toCharArray();
        int digital=0,letter=0;
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                letter++;
            }
            if (Character.isDigit(aChar)) {
                digital++;
            }
        }
        if (letter-digital>1) {
            return "";
        }
        StringBuilder stringBuilder=new StringBuilder(s);
        char c = s.charAt(0);
        stringBuilder=stringBuilder.deleteCharAt(0).append(c);
        return stringBuilder.toString();
    }
}
