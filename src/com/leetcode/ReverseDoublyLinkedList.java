package com.leetcode;

/**
 * Created by mbiswas on 7/31/18.
 */
public class ReverseDoublyLinkedList {

  class Node {
     int data;
     Node next;
     Node prev;
  }


    Node Reverse(Node head) {
        if (head == null) {
            return null;
        }
        while (head != null) {
            Node i = head.prev;
            head.prev = head.next;
            head.next = i;
            if (head.prev == null) {
                return head;
            }
            head = head.prev;
        }
        return head;
    }
}
