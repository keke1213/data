package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode994_腐烂的橘子 {
    public static void main(String[] args) {
        orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}});
    }
    public static int orangesRotting(int[][] grid) {
        int length = grid.length;
        int count=0;
        int round=0;
        Queue<int[]>  queue=new LinkedList<>();
        for (int i=0;i<length;i++){
            for (int j=0;j<grid[i].length;j++){
                if (grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
                if (grid[i][j]==1){count++;}
            }
        }
        while (!queue.isEmpty()&&count!=0){
            int size = queue.size();
            round++;
            for (int i=0;i<size;i++){
                int[] poll = queue.poll();
                int r=poll[0];
                int l=poll[1];
                if (r-1>=0&&grid[r-1][l]==1){
                    grid[r-1][l]=2;
                    queue.offer(new int[]{r-1,l});
                    count--;
                }
                if (r+1<length&&grid[r+1][l]==1){
                    grid[r+1][l]=2;
                    queue.offer(new int[]{r+1,l});
                    count--;
                }
                if (l-1>=0&&grid[r][l-1]==1){
                    grid[r][l-1]=2;
                    queue.offer(new int[]{r,l-1});
                    count--;
                }
                if (l+1<grid[r].length&&grid[r][l+1]==1){
                    grid[r][l+1]=2;
                    queue.offer(new int[]{r,l+1});
                    count--;
                }
            }
        }
        return count==0?round:-1;
    }
}
