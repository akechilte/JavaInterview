package com.Interview.Oath;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by dbiswas on 7/19/18.
 */

// YouTube: https://www.youtube.com/watch?v=6bvnZzwiKzs&list=PLNmW52ef0uwsjnM06LweaYEZr-wjPKBnj&index=35
public class MargeSortedArray {

    private static class QueueNode implements Comparable<QueueNode> {
        int array;
        int index;
        int value;


        public QueueNode(int array, int index, int value) {
            this.array = array; //index of main array
            this.index = index; //index of the array inside the main array
            this.value = value; //actual value
        }

        @Override
        public int compareTo(QueueNode n) {
            if (value > n.value) return 1;
            if (value < n.value) return -1;
            return 0;
        }


    }

    public static int[] merge(int[][] arrays) {
        PriorityQueue<QueueNode> pq = new PriorityQueue<QueueNode>();

        int size = 0;
        for (int i = 0; i < arrays.length; i++) {
            size += arrays[i].length;
            if (arrays[i].length > 0) {
                pq.add(new QueueNode(i, 0, arrays[i][0]));
            }
        }

        int[] result = new int[size];
        for (int i = 0; !pq.isEmpty(); i++) {
            QueueNode n = pq.poll();
            result[i] = n.value;
            int newIndex = n.index + 1; // next element's index (not sure this element is there or not, will chk in next line)
            if (newIndex < arrays[n.array].length) { // current sub array has more element to add?
                pq.add(new QueueNode(n.array, newIndex,
                        arrays[n.array][newIndex]));
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };
        int[] arr3 = { 0, 9, 10, 11 };

        int[] arr4 = {1,3,5};
        int[] arr5 = {2,4};
        int[] result = merge(new int[][] { arr4, arr5});


//        int[] result = merge(new int[][] { arr1, arr2, arr3 });
        System.out.println(Arrays.toString(result));
    }
}






/*
    For Decending Order, you need to change the code in 2 places

    1. This will be input arrays
    int[] arr1 = { 7,5,3,1};
    int[] arr2 = { 8,6,4,2 };
    int[] arr3 = {11,10,9,0};

    2. change the compareTo method logic
    public int compareTo(QueueNode n) {
        if (value < n.value) return 1;
        if (value > n.value) return -1;
        return 0;
    }*/
