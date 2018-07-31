package com.company.ebay;

import com.hackerrank.ds.BST.BinarySearchTree;

import java.util.*;

/**
 * Created by mbiswas on 7/28/18.
 */

//https://www.youtube.com/watch?v=MILxfAbIhrE
public class IsBST {
    static class TreeNode{
        int data;
        TreeNode left,right;
        public TreeNode(int data){
            this.data = data;
        }
    }

    TreeNode root;

    public boolean isBST(TreeNode root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isBST(TreeNode root, int min, int max){

        if(root == null) return true;

        if(root.data <= min || root.data >= max){
            return false;
        }

        return isBST(root.left,min,root.data) && isBST(root.right, root.data, max);

    }


    // similar to Iterative InOrder travarse with extra current and prev logic
    public boolean isBSTIterative(TreeNode root){
        if(root == null) return true;

        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        int prev = Integer.MIN_VALUE;
        int current;

        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                current = node.data;
                if(current < prev){
                    return false;
                }
                prev = current;
                node = node.right;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        IsBST tree = new IsBST();
        // Way:1 creating tree
        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);

        System.out.println(tree.isBST(tree.root));
        System.out.println(tree.isBSTIterative(tree.root));



    }
}
