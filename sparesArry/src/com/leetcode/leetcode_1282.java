package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_1282 {
    public static void main(String[] args) {
//        groupThePeople(new int[]{3,3,3,3,3,1,3});
        groupThePeople(new int[]{1});
//        groupThePeople(new int[]{2,1,3,3,3,2});
    }
    //用户分组
    //我的思路采用二位数组使用空间换时间
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        int length = groupSizes.length;
        int[][] ints = new int[length+1][length+1];
        for (int i = 0; i < ints.length; i++) {
            Arrays.fill(ints[i],-1);
        }
        for (int i = 0; i < length ; i++) {
            int j=0;
            boolean flag=true;
            while (flag){
                if (ints[groupSizes[i]][j]==-1){
                   ints[groupSizes[i]][j] = i;//把下标赋值给数组
                    flag=false;
                }else {
                    j++;
                }
            }
        }
        List<List<Integer>> arrayLists = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i][0]==-1) {
                continue;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            int j=0;boolean flag=true;
            while (flag){
                if (ints[i][j]==-1){
                    arrayLists.add(arrayList);
                    flag=false;
                }else if (arrayList.size()>=i){
                    arrayLists.add(arrayList);
                    arrayList=new ArrayList<>();
                    arrayList.add(ints[i][j]);
                    j++;
                }else {
                    arrayList.add(ints[i][j]);
                    j++;
                }
            }
        }
        return arrayLists;
    }
}
