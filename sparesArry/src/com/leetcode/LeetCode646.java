package com.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode646 {
    public static void main(String[] args) {
        findLongestChain(new int[][]{{1,2},{2,3},{3,4}});
//        findLongestChain(new int[][]{{1,4},{2,3},{3,4}});
    }
    public static int findLongestChain(int[][] pairs) {
        int curr = Integer.MIN_VALUE, res = 0;
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        for (int[] p : pairs) {
            if (curr < p[0]) {
                curr = p[1];
                res++;
            }
        }
        return res;
    }
}
