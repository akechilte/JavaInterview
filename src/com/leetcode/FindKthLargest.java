package com.leetcode;

import java.util.PriorityQueue;

/**
 * Created by mbiswas on 8/11/18.
 */
public class FindKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.add(i);
            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        System.out.println(findKthLargest(arr, 4));
    }
}
