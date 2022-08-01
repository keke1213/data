package com.leetcode;

public class leetcode19_删除倒数第n个节点 {
    public static void main(String[] args) {

    }
    public static   ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head,slow=head;
        while (--n>0){
            fast=fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        if (fast==null)return head.next;
        slow.next=slow.next.next;
        return head;
    }
    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
}
