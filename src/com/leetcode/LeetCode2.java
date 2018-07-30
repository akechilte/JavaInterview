package com.leetcode;

import com.hackerrank.ds.linkedlist.LinkedList;

/**
 * Created by mbiswas on 6/12/18.
 */
public class LeetCode2 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //solution : https://leetcode.com/problems/add-two-numbers/description/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            int value = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(value);
            l3.next = newNode;
            l3 = newNode;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            l3.next = new ListNode(carry);
        }
        return dummy.next;
    }

}
