package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class leetcode_A_B_2C {
    public static void main(String[] args) {
//        fun(new int[]{2,7,3,0});
        fun(new int[]{1,1,1});
//        fun(new int[]{});
    }
    public static void fun(int[] arr){
        int[] ints=new int[65536];
        for (int i : arr) {
            ints[i]=1;
        }
        Arrays.sort(arr);
        for (int i=arr.length-1;i>0;i--){
            if (ints[arr[i]/2]!=0&&ints[(arr[i]-arr[i]/2)/2]!=0){
                System.out.println(arr[i]+" "+arr[i]/2+" "+(arr[i]-arr[i]/2)/2);
                return;
            }
        }
        System.out.println(0);
    }
}
