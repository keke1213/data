package com.leetcode;

import java.util.HashMap;

public class LeetCode1460 {
    public static void main(String[] args) {
        canBeEqual(new int[]{1,2,3,4},new int[]{2,4,1,3});
    }
    public static boolean canBeEqual(int[] target, int[] arr) {
        int length1 = target.length;
        int length2 = arr.length;
        if (length1 != length2) return false;
        boolean flag = true;
        int index = 0;
        for (int i = 0; i < length1; i++) {
            for (int j = index; j < length2; j++) {
                if (target[i] == arr[j]) {
                    swap(arr,i,j);
                    flag = false;
                    index++;
                    break;
                }
            }
            if (flag) return false;
            flag = true;
        }
        return true;
    }
    public static void swap(int[] arr, int a, int b) {
       arr[a] = arr[a] ^ arr[b];
       arr[b] = arr[a] ^ arr[b];
       arr[a] = arr[a] ^ arr[b];
    }
}
