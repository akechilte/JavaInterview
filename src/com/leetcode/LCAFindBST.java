package com.hackerrank.ds.geeksforgeeks;

/**
 * Created by dbiswas on 7/13/18.
 */
public class LCAFindBST {
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
        if(root.data > Math.max(n1.data, n2.data)){
            return findLCA(root.left,n1,n2);
        }else if(root.data < Math.min(n1.data, n2.data)){
            return findLCA(root.right, n1, n2);
        }else{
            return root;
        }

    }

    public static void main(String[] args) {
        LCAFindBST tree = new LCAFindBST();
        // creating binary tree
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(-10);
        tree.root.left.right = new TreeNode(8);
        tree.root.left.right.left = new TreeNode(6);
        tree.root.left.right.right = new TreeNode(9);

        tree.root.right = new TreeNode(30);
        tree.root.right.left = new TreeNode(25);
        tree.root.right.right = new TreeNode(60);
        tree.root.right.left.right = new TreeNode(28);
        tree.root.right.right.right = new TreeNode(78);

        TreeNode node = findLCA(tree.root,tree.root.right.left.right,tree.root.right.right.right);
        System.out.println(node.data);

    }
}

