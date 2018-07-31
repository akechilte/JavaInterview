package com.leetcode;

import java.util.Arrays;

/**
 * Created by mbiswas on 6/20/18.
 */

//88. Merge Sorted Array
public class MergeTwoSortedArray {
    // Solution1
    public static void merge(int A[], int m, int B[], int n) {

        System.out.println("A: " +Arrays.toString(A) +"     m: " +m +"     n: " +n);
        System.out.println("B: " +Arrays.toString(B));
        //System.out.println(Arrays.toString(A) +"     m: " +m +"     n: " +n);
        while(m > 0 && n > 0){
            if(A[m-1] > B[n-1]){
                A[m+n-1] = A[m-1];
                m--;
            }else{
                A[m+n-1] = B[n-1];
                n--;
            }

            System.out.println(Arrays.toString(A) +"     m: " +m +"     n: " +n);
        }

        while(n > 0){
            A[m+n-1] = B[n-1];
            n--;
            System.out.println("-----------");
            System.out.println(Arrays.toString(A) +"     m: " +m +"     n: " +n);
        }
    }



    // Solution2
    public static void merge1(int A[], int m, int B[], int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (k >= 0) {
            if (j < 0 || (i >= 0 && A[i] > B[j]))
                A[k--] = A[i--];
            else
                A[k--] = B[j--];

            System.out.println(Arrays.toString(A) +"---- i: " +i +"----- j: " +j);
        }
    }


    public static void main(String[] args) {
        //Input: 1 [If all elements of A is greater than B elements] only this case we need 2nd while loop
        //int[] A = {7,9,10,0,0,0};
        //int[] B = {1,3,5};


        //Input: 2 [Another example to call 2nd while loop]
        int[] A = {7,9,10,0,0,0};
        int[] B = {1,3,8};


        //Input: 3
        //int[] A = {1,2,3,0,0,0};
        //int[] B = {2,5,6};


        //Input: 4 [Mixed]
        //int[] A = {1,4,9,0,0,0};
        //int[] B = {2,5,10};



        int m = 3;
        int n = 3;

        merge(A, m, B, n);
    }
}
