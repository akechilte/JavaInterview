package com.hackerrank.ds.tree;


/**
 * Created by mbiswas on 5/16/18.
 */
public class App {


    public static void main(String[] args) {
        Node node = new Node(10);

        node.insert(5);
        node.insert(15);

        node.printInOrder();

        System.out.println(node.contains(5));

        System.out.println(node.contains(22));
    }
}
