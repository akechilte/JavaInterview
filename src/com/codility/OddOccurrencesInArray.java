package com.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mbiswas on 6/6/18.
 */
public class OddOccurrencesInArray {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int elem = 0;

        for (int i = 0; i < A.length; i++) {
            elem ^= A[i];
            System.out.println(A[i] +" : " +elem);
        }

        return elem;
    }

    public static void main(String[] args) {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        int[] a = {2,5,3,7,1,2,7,5,1};
        System.out.println(oddOccurrencesInArray.solution(a));

    }
}
