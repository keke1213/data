package com.leetcode;

public class LeetCode654Mid {
    public static void main(String[] args) {
        constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
    }
    public static class TreeNode {
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
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        int max = -1;
        int mid = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                mid = i;
            }
        }
        TreeNode treeNode = new TreeNode(max);
        //左子树
        dfs(nums,treeNode.left,0,mid-1);
        dfs(nums,treeNode.right,mid+1,nums.length-1);
        return treeNode;
    }

    private static void dfs(int[] nums, TreeNode root, int left, int right) {
        if (left >= right) {
            return;
        }
        int areaMax = -1;
        int index = -1;
        for (int i = left; i < right; i++) {
            if (nums[i] > areaMax) {
                areaMax = nums[i];
                index = i;
            }
        }
        root = new TreeNode(areaMax);
        dfs(nums,root.left,left,index-1);
        dfs(nums,root.right,index+1,right);
    }


}
