package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//21. Merge Two Sorted Lists
public class MergeTwoSortedLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;

        while(l1!=null || l2!=null){
            if(l1!= null && l2!= null){
                if(l1.val < l2.val){
                    p.next = l1;
                    l1 = l1.next;
                }else{
                    p.next = l2;
                    l2 = l2.next;
                }
                p = p.next;
            }else if(l1 == null){
                p.next = l2;
                break;
            }else if(l2 == null){
                p.next = l1;
                break;
            }
        }
        return head.next;
    }


    public static void main(String[] args) {

    }

}
