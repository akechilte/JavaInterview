package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//237. Delete Node in a Linked List
public class DeleteNodeInLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

    }
}
