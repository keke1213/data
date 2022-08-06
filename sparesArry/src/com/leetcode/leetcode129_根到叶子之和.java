package com.leetcode;

public class leetcode129_根到叶子之和 {
    public static void main(String[] args) {

    }
    public int sumNumbers(TreeNode root) {
       return dfs(root,0);
    }

    private int dfs(TreeNode root, int i) {
        if (root==null)return 0;
        i=i*10+root.val;
        if (root.left==null&&root.right==null){
            return i;
        }
        return dfs(root.right,i)+dfs(root.left,i);
    }

    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
}
