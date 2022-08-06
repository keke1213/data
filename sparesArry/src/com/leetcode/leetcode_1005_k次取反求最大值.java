package com.leetcode;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;

public class leetcode_1005_k次取反求最大值 implements Callable {
    public static void main(String[] args) {
//        largestSumAfterKNegations(new int[]{4,2,3},1);
//        largestSumAfterKNegations(new int[]{3,-1,0,2},3);
//        largestSumAfterKNegations(new int[]{-2,9,9,8,4
//        },5);
//        FutureTask futureTask= new FutureTask(new leetcode_1005_k次取反求最大值());
//        Thread thread=new Thread(futureTask);

//        ConcurrentHashMap
//        HashMap<Integer,Integer> hashMap=new HashMap<>();
//        hashMap.put(1,1);
//        hashMap.put(2,1);
//        hashMap.put(3,1);
//        hashMap.put(4,1);
//        hashMap.put(5,1);
//        hashMap.put(6,1);
        System.out.println("121".hashCode());
        System.out.println("121".hashCode());
        Date date=new Date();



//        System.out.println("123".hashCode());
//        System.out.println(hashMap.hashCode());
//        thread.start();
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        for (int num : nums) {
            if (num==0){
                k=0;
            }
            if (k>0){
                if (num<0){
                    sum+=-num;
                    k--;
                }else {
                    sum+=k%2==0?num:-num;
                }
            }else {
                sum+=num;
            }
        }
        return sum;

    }

    @Override
    public Object call() throws Exception {
        System.out.println("11111");
        return 1;
    }
}
