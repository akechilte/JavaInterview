package com.company.ebay;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by mbiswas on 7/26/18.
 */

// This is only for tree
public class BFSTree {

    static class Node{
        int data;
        Node left, right;
        boolean visited = false;
        public Node(int data){
            this.data = data;
        }
    }

    Node root;

    public void travarse(Node root){
        Queue<Node> queue = new LinkedList<>();
        if(root != null){
            queue.add(root);
            while(!queue.isEmpty()){
                Node node = queue.remove();
                System.out.println(node.data);
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }


    public boolean search(Node root, Node goal){
        Queue<Node> queue = new LinkedList<>();
        if(root != null){
            queue.add(root);
            while(!queue.isEmpty()){
                Node node = queue.remove();
                if(node.data == goal.data){
                    return true;
                }
                System.out.println(node.data);
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BFSTree bfs = new BFSTree();
        bfs.root = new Node(1);
        bfs.root.left = new Node(2);
        bfs.root.right = new Node(3);
        bfs.root.left.left = new Node(4);
        bfs.root.left.right = new Node(5);
        bfs.travarse(bfs.root.left);
        System.out.println(bfs.search(bfs.root.left,  bfs.root.left.left));

    }
}
