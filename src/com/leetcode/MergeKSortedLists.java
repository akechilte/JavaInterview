package com.company.Yahoo;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by mbiswas on 8/19/18.
 */
public class MergeKSortedLists {

    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
            public int compare(ListNode l1, ListNode l2){
                return l1.val - l2.val;
            }
        });

        ListNode head = new ListNode(0);
        ListNode p = head;
        for(ListNode list: lists){
            if(list!= null){
                pq.offer(list);
            }
        }

        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            p.next = node;
            p = p.next;

            if(node.next != null){
                pq.offer(node.next);
            }
        }

        return head.next;
    }
}
