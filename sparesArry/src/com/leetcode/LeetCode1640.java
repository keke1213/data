package com.leetcode;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeetCode1640 {
    public static void main(String[] args) {

    }
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Set<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        int count = 0;
        return false;
    }
}