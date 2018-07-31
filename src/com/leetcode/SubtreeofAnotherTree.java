package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//572. Subtree of Another Tree

public class SubtreeofAnotherTree {
    //Definition for a binary tree node.
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /* This function returns true if t is a subtree of s, otherwise false */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        /* base cases */
        if(s==null && t==null)  return true;
        if(s==null || t==null)  return false;

        if(areNodeSame(s,t))    return true;

        /* If the tree with root as current node doesn't match then
           try left and right subtrees one by one */
        return isSubtree(s.left,t) || isSubtree(s.right,t);

    }

    /* A utility function to check whether trees with roots as node1 and
       node2 are identical or not */
    private boolean areNodeSame(TreeNode node1, TreeNode node2){
        if(node1==null && node2==null)  return true;
        if(node1==null || node2==null)  return false;

        /* Check if the data of both nodes are same and data of left and right
           subtrees are also same */
        return (node1.val == node2.val && areNodeSame(node1.left,node2.left) && areNodeSame(node1.right,node2.right));

    }

    public static void main(String[] args) {

    }
}
