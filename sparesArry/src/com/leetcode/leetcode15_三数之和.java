package com.leetcode;

import java.util.*;

public class leetcode15_三数之和 {
    public static void main(String[] args) {
//        List<List<Integer>> lists = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
//        List<List<Integer>> lists = threeSum(new int[]{0, 0, 0});
        List<List<Integer>> lists = threeSum(new int[]{34, 55, 79, 28, 46, 33, 2, 48, 31, -3, 84, 71, 52, -3, 93, 15, 21, -43, 57, -6, 86, 56, 94, 74, 83, -14, 28, -66, 46, -49, 62, -11, 43, 65, 77, 12, 47, 61, 26, 1, 13, 29, 55, -82, 76, 26, 15, -29, 36, -29, 10, -70, 69, 17, 49});
        Iterator<List<Integer>> iterator = lists.iterator();
        while (iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while (iterator1.hasNext()){
                System.out.print(iterator1.next()+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        if (length<3)return null;
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        int sum=0;
        int index=0;
        Arrays.sort(nums);
        dfs(nums,index,set,list,sum);
        Iterator<List<Integer>> iterator = set.iterator();
        while (iterator.hasNext()){
            lists.add(iterator.next());
        }
        return lists;
    }

    private static void dfs(int[] nums, int index, Set<List<Integer>> set, List<Integer> list, int sum) {

        if (list.size()==3&&sum==0){
            List list1=new ArrayList(list);
            Collections.sort(list1);
            set.add(list1);
            return;
        }
        if (index>=nums.length)return;

        sum=sum+nums[index];
        list.add(nums[index]);
        dfs(nums,index+1,set,list,sum);
        sum=sum-nums[index];
        list.remove(list.size()-1);
        dfs(nums,index+1,set,list,sum);
    }

}
