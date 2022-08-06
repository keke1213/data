package com.collection;

import java.util.*;

public class SetToList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(-1);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(0);
        list1.add(-1);
        Iterator<Integer> iterator1 = list1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        Set<List<Integer>> set=new HashSet<>();
        set.add(list);
        set.add(list1);
        System.out.println(set.size());//不同集合的元素相同且顺序相同加入到set中算一个元素

    }
}
