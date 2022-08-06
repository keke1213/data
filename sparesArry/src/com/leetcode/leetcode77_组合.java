package com.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class leetcode77_组合 {
    public static void main(String[] args) {
        leetcode77_组合 leetcode77_组合=new leetcode77_组合();
        leetcode77_组合.combine(4,2);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists=new ArrayList<>();
        Deque<Integer> list=new LinkedList<>();
        dfs(1,n,k,list,lists);
        return lists;
    }
    private void dfs(int i, int n, int k, Deque<Integer> list, List<List<Integer>> lists) {
        if (k==0){
            lists.add(new ArrayList<>(list));
            return;
        }
        if (n-k+1<i){return;}
        dfs(i+1,n,k,list,lists);
        list.addLast(i);
        dfs(i+1,n,k-1,list,lists);
        list.removeLast();
    }
}
