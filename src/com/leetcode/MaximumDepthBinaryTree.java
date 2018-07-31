package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//104. Maximum Depth of Binary Tree
public class MaximumDepthBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        int biggerDepth = Math.max(leftDepth, rightDepth);

        return biggerDepth + 1; // plus 1 for root

    }

    public static void main(String[] args) {

    }
}
