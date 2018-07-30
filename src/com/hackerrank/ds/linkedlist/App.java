package com.hackerrank.ds.linkedlist;

/**
 * Created by mbiswas on 5/16/18.
 */
public class App {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.prepend(3);
        linkedList.prepend(2);
        linkedList.prepend(1);

        linkedList.showLinkedList();

        linkedList.deleteWithValue(5);

        System.out.println("---------------------------------");

        linkedList.showLinkedList();

    }
}
