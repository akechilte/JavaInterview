package com.hackerrank.ds.geeksforgeeks;

//url: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

import apple.laf.JRSUIUtils;

/**
 * Created by dbiswas on 7/12/18.
 */
public class BinarySearchTree {

     static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }


    }


    TreeNode root;

    public void insert(int data){
        root = insert(root,data);
    }

    private TreeNode insert(TreeNode root, int data){

        if(root == null){
            root = new TreeNode(data);
            return root;
        }

        else{
            if(data < root.data){
                root.left = insert(root.left,data);
            }else if(data > root.data){
                root.right = insert(root.right, data);
            }
        }

        return root;
    }


    public void inorder(){
        inorderTraverse(root);
    }

    //Inorder (Left, Root, Right) :  1 2 3 4 5
    private void inorderTraverse(TreeNode root){
        if(root != null){
            inorderTraverse(root.left);
            System.out.println(root.data);
            inorderTraverse(root.right);
        }
    }



    public void preorder(){
        preorderTraverse(root);
    }

    //Preorder (Root, Left, Right): 4 2 1 3 5
    private void preorderTraverse(TreeNode root){
        if(root != null){
            System.out.println(root.data);
            preorderTraverse(root.left);
            preorderTraverse(root.right);
        }
    }

    public void postorder(){
        postorderTraverse(root);
    }

    //Postorder (Left, Right, Root) : 1 3 2 5 4
    private void postorderTraverse(TreeNode root){
        if(root != null){
            postorderTraverse(root.left);
            postorderTraverse(root.right);
            System.out.println(root.data);
        }
    }



    public int smallestValue(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }



    public int largestValue(TreeNode root){
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }


    public boolean find(int data){
        return find(root, data);
    }

    private boolean find(TreeNode root, int data) {
        if(root != null) {
            if (root.data == data) {
                return true;
            } else {
                if(data < root.data){
                    return find(root.left, data);
                }else{
                    return find(root.right, data);
                }
            }
        }
        return false;
    }



    void delete(int key)
    {
        root = deleteRec(root, key);
    }

    private TreeNode deleteRec(TreeNode root, int key)
    {
        /* Base Case: If the tree is empty */
        if (root == null)  return root;

        /* Otherwise, recur down the tree */
        if (key < root.data)
            root.left = deleteRec(root.left, key);
        else if (key > root.data)
            root.right = deleteRec(root.right, key);

            // if key is same as root's key, then This is the node to be deleted
        else
        {

            // case 1 and 2: node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;



            // case 3: node with two children:
            // Get the inorder successor
            //System.out.println("before: " +root.data);
            root.data = smallestValue(root.right); // smallest in the right subtree
            //System.out.println("After: " +root.data);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }


    public int getLeafCount()
    {
        return getLeafCount(root);
    }

    public int getLeafCount(TreeNode root)
    {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        else
            return getLeafCount(root.left) + getLeafCount(root.right);
    }


    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;

        int left = getLeftHeight(root);
        int right = getRightHeight(root);

        if(left==right){
            return (int)Math.pow(2,left+1) - 1; // h -> left +1 (added 1 for root)
        }else{
            return countNodes(root.left)+countNodes(root.right)+1;
        }
    }

    public int getHeight(TreeNode root){
        if(root==null)
            return 0;
        int left = getLeftHeight(root);
        int right = getRightHeight(root);

        return Math.max(left,right) +1;
    }

    public int getLeftHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int height = 0;
        while(root.left != null){
            height ++;
            root = root.left;
        }
        //System.out.println("\nLeft height: " + height);
        return height;
    }


    public int getRightHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int height = 0;
        while(root.right != null){
            height ++;
            root = root.right;
        }
        //System.out.println("\nRight height: " + height);
        return height;
    }

    // Driver method
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        // Way:1
//        tree.root = new TreeNode(4);
//        tree.root.left = new TreeNode(2);
//        tree.root.right = new TreeNode(5);
//        tree.root.left.left = new TreeNode(1);
//        tree.root.left.right = new TreeNode(3);

        //way 2:
        int[] arr = {4,2,5,1,3};
        for(int val : arr){
            tree.insert(val);
        }

        System.out.println("Preorder traversal of constructed BST");
        tree.preorder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.inorder();

        System.out.println("Preorder traversal of binary tree is ");
        tree.preorder();


        System.out.println("\nPostorder traversal of binary tree is ");
        tree.postorder();


        System.out.println("\nFind: " +tree.find(5));

        System.out.println("\nLargest Value: " +tree.largestValue(tree.root));

        System.out.println("\nSmallest Value: " +tree.smallestValue(tree.root));

        System.out.println("\nLeaf Node count: " +tree.getLeafCount());

        System.out.println("\nTotal Node count: " +tree.countNodes(tree.root));

        System.out.println("\nHeight of the Tree: " +tree.getHeight(tree.root));

        tree.delete(2);

        System.out.println("\nInorder traversal After Delete Node: " +2);
        tree.inorder();

    }




}
