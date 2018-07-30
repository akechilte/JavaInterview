package com.codility;

/**
 * Created by mbiswas on 6/6/18.
 */
public class CyclicRotationArray {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if(A == null){
            return null;
        }

        int[] output = new int[A.length];
        for(int i = 0; i <= A.length-1 ; i++){
            output[(i + K) % A.length] = A[i];
        }

        return output;
    }



    public static void main(String[] args) {
        CyclicRotationArray cyclicRotationArray = new CyclicRotationArray();

        int[] input = new int[]{3,8,9,7,6};
        int[] a = new int[]{1,2,3,4};

        int[] results = cyclicRotationArray.solution(input,3);

        for(int result : results){
            System.out.print(result +" ");
        }
    }
}
