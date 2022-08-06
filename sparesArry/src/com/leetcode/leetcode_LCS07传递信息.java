package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode_LCS07传递信息 {
    public static void main(String[] args) {
        int[][] ints = {{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
        Arrays.sort(ints, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]==o2[1])
                {
                    return o1[0]-o2[0];
                }else
                {
                    return o1[1]-o2[1];
                }
            }
        });
        System.out.println();


//        numWays()
    }
    public static int numWays(int n, int[][] relation, int k) {
        Arrays.sort(relation);
        return 0;
    }
}
