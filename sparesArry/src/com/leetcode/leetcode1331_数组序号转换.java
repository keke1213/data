package com.leetcode;

import java.util.*;

public class leetcode1331_数组序号转换 {
    public static void main(String[] args) {
//        arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12});
//        arrayRankTransform(new int[]{100,100,100});
        arrayRankTransform(new int[]{40,10,20,30});
    }
    public static int[] arrayRankTransform(int[] arr) {
        int[] newArr=new int[arr.length];
        System.arraycopy(arr,0,newArr,0,arr.length);
        HashMap<Integer ,Integer> hashMap=new HashMap<>();
        Arrays.sort(newArr);
        for (int i : newArr) {
            if (!hashMap.containsKey(i)){
                hashMap.put(i,hashMap.size()+1);
            }
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=hashMap.get(arr[i]);
        }
        return arr;
    }
}
