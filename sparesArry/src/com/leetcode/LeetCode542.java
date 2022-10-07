package com.leetcode;

import java.util.*;

public class LeetCode542 {
    public static void main(String[] args) {
//        updateMatrix(new int[][]{{0,0,0},{0,1,0},{0,0,0}});
        updateMatrix(new int[][]{{0,0,0},{0,1,0},{1,1,1}});
    }
    static int[][] way = {{1,0},{-1,0},{0,1},{0,-1}};
    public static int[][] updateMatrix(int[][] mat) {
        Queue<int[]> list = new LinkedList<>();
        boolean[][] isExe = new boolean[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] ==0) {
                    list.add(new int[]{i,j});
                    isExe[i][j] = true;
                }
            }
        }
        while (!list.isEmpty()) {
            int[] poll = list.poll();
            int i = poll[0];
            int j = poll[1];
            for (int k = 0; k < way.length; k++) {
                int n_i = i + way[k][0];
                int n_j = j + way[k][1];
                if (n_i > 0 && n_i < mat.length && n_j > 0 && n_j < mat[0].length && !isExe[n_i][n_j]) {
                    mat[n_i][n_j] = mat[i][j] + 1;
                    isExe[n_i][n_j] = true;
                    list.add(new int[]{n_i,n_j});
                }
            }
        }
        return mat;
    }
}
