package com.hackerrank.ds.geeksforgeeks;

/**
 * Created by dbiswas on 7/13/18.
 */
public class LCAFind {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }


    TreeNode root;

    public static TreeNode findLCA(TreeNode root, TreeNode n1, TreeNode n2){
        if(root == null) return null;
        if(root == n1 || root == n2) return root;

        TreeNode left = findLCA(root.left, n1, n2);
        TreeNode right = findLCA(root.right, n1, n2);

        if(left == null && right == null) return null;
        if(left != null && right != null) return root;

        return left!=null? left : right;
    }

    public static void main(String[] args) {
        LCAFind tree = new LCAFind();
        // creating binary tree
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(6);
        tree.root.left.left = new TreeNode(2);
        tree.root.left.right = new TreeNode(11);
        tree.root.left.right.left = new TreeNode(9);
        tree.root.left.right.right = new TreeNode(5);
        tree.root.right = new TreeNode(8);
        tree.root.right.right = new TreeNode(13);
        tree.root.right.left = new TreeNode(17);

        TreeNode node = findLCA(tree.root,tree.root.left.left,tree.root.left.right.right);
        System.out.println(node.data);

    }
}
