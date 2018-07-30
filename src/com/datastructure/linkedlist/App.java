package com.datastructure.linkedlist;

/**
 * Created by mbiswas on 3/26/18.
 */
public class App {


    public static void main(String[] args){

        Node nodeA = new Node();
        nodeA.data = 3;

        Node nodeB = new Node();
        nodeB.data = 4;

        Node nodeC = new Node();
        nodeC.data = 5;

        Node nodeD = new Node();
        nodeD.data = 7;


        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));
        System.out.println(listLength(nodeC));
        System.out.println(listLength(nodeD));



    }


    public static int listLength(Node node){

        int count = 0;
        Node currentNode = node;
        while (currentNode != null){
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }
}
