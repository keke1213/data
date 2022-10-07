package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode788 {
    static int[] check = {0, 0, 1, -1, -1, 1, 1, -1, 0, 1};

    public static int rotatedDigits(int n, List<Integer> list) {
        int ans = 0;
        for (int i = 1; i <= n; ++i) {
            String num = String.valueOf(i);
            boolean valid = true, diff = false;
            for (int j = 0; j < num.length(); ++j) {
                char ch = num.charAt(j);
                if (check[ch - '0'] == -1) {
                    valid = false;
                } else if (check[ch - '0'] == 1) {
                    diff = true;
                }
            }
            if (valid && diff) {
                ++ans;
                list.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(rotatedDigits(100,new ArrayList<>()));
    }
}
