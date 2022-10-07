package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode1636按照频率排序 {
    public static void main(String[] args) {
//        frequencySort(new int[]{1,1,2,2,2,3});
        frequencySort(new int[]{2,3,1,3,2});
        frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1});
    }
    public static int[] frequencySort(int[] nums) {
//        Arrays.stream(nums).sorted().forEach(obj -> System.out.println(obj));
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> collect = map.entrySet().stream().sorted((o1, o2) -> {
            if (o1.getValue().equals(o2.getValue())) {
                return o2.getKey() - o1.getKey();
            }
            return o1.getValue() - o2.getValue();
        })
                .map(obj -> obj.getKey()).collect(Collectors.toList());
//        .forEach(obj -> {
//            System.out.println(obj.getKey());
//        });
//        list.stream().sorted(list::)
        return new int[]{};
    }
//    public static Object[] test() {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(12);
//        list.add(14);
//        list.stream().sorted(Comparator.comparing(Integer::intValue).reversed());
//        return null;
//    }
}
