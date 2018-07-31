package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//206. Reverse Linked List
public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode temp = null;
        ListNode previous = null;

        while(current != null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    public static void main(String[] args) {

    }
}
