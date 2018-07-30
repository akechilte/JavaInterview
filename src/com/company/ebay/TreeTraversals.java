package com.company.ebay;

import java.util.Stack;

/**
 * Created by mbiswas on 7/28/18.
 */
public class TreeTraversals {

    static class TreeNode{
        int data;
        TreeNode left,right;
        public TreeNode(int data){
            this.data = data;
        }
    }

    TreeNode root;

    //[Output: 1 2 3 4 5]
    //https://www.youtube.com/watch?v=nzmtCFNae9k&t=527s
    public void inorderItr(TreeNode root){
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                System.out.print(node.data);
                node = node.right;
            }
        }

    }

    //[output : 4 2 1 3 5]
    public void preOrderItr(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.print(node.data);

            if(node.right!= null){
                stack.push(node.right);
            }

            if(node.left != null){
                stack.push(node.left);
            }
        }
    }


    //with 2 stacks [Output: 1 3 2 5 4]
    //https://www.youtube.com/watch?v=qT65HltK2uE
    public void postOrderItr(TreeNode root){

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode node = s1.pop();
            s2.push(node);
            if(node.left != null){
                s1.push(node.left);
            }
            if(node.right != null){
                s1.push(node.right);
            }
        }

        while(!s2.isEmpty()){
            TreeNode node = s2.pop();
            System.out.print(node.data);
        }

    }


    //with 1 stack [Output: 1 3 2 5 4]
    //https://www.youtube.com/watch?v=qT65HltK2uE
    public void postOrderItrOneStack(TreeNode root){
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while(current != null || !stack.isEmpty()){
            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data);
                    while(!stack.isEmpty() && temp == stack.peek().right){ //right traverse is done?
                        temp = stack.pop();
                        System.out.print(temp.data);
                    }
                }else{
                    current = temp; // when temp is not null
                }
            }
        }

    }

    public static void main(String[] args) {
        TreeTraversals tree = new TreeTraversals();
        // Way:1 creating tree
        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);


        tree.postOrderItr(tree.root);
        System.out.println();
        tree.postOrderItrOneStack(tree.root);
        System.out.println();
        tree.inorderItr(tree.root);
        System.out.println();
        tree.preOrderItr(tree.root);

    }
}
