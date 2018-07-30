package com.datastructure.singlylinkedlist;

/**
 * Created by mbiswas on 3/27/18.
 */
public class SinglyLinkedList {

    private Node first;


    public boolean isEmpty(){
        return (first == null);
    }


    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }


    public  Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }
}
