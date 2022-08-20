package com.leetcode;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class leetcode_23合并k个链表_hard {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(5, null);
        ListNode listNode1 = new ListNode(4, listNode);
        ListNode listNode2 = new ListNode(1, listNode1);

        ListNode lisNode = new ListNode(4, null);
        ListNode lisNode1 = new ListNode(3, lisNode);
        ListNode lisNode2 = new ListNode(1, lisNode1);

        ListNode liNode = new ListNode(6, null);
        ListNode liNode1 = new ListNode(2, liNode);

//        mergeKLists(new ListNode[]{lisNode2,listNode2,liNode1});
        mergeKLists(new ListNode[]{});

    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode mergeKLists(ListNode[] lists) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                Integer orDefault = treeMap.getOrDefault(temp.val, 0);
                treeMap.put(temp.val,orDefault+1);
                temp=temp.next;
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = treeMap.entrySet().iterator();
        ListNode head = new ListNode();
        ListNode temp = head;
        if (treeMap.isEmpty()) {
            return null;
        }
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            Integer key = next.getKey();
            Integer value = next.getValue();
            while (value > 0) {
                ListNode listNode = new ListNode(key, null);
                temp.next = listNode;
                temp = temp.next;
                value--;
            }
        }
        return head.next;
    }
}
