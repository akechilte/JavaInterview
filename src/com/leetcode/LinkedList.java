package com.hackerrank.ds.linkedlist;

/**
 * Created by mbiswas on 5/16/18.
 */
public class LinkedList {

    private static class Node{
        private int data;
        private Node next;

        private Node(int data){
            this.data = data;
        }
    }


    private Node head;

    public void append(int data) {
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = node;

    }


    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;


    }

    public void deleteWithValue(int data) {

        if(head == null) return;

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }


    }


    public void showLinkedList(){ //my method

        if(head == null){
            System.out.println("LinkedList is Empty");
        }else {

            Node current = head;
            while (current.next != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}
