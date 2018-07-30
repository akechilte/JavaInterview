package com.codility;

/**
 * Created by mbiswas on 6/6/18.
 */
public class BinaryGapCount {

    public int solution(int N) {
        // write your code in Java SE 8

        String binary = Integer.toBinaryString(N);
        System.out.println(binary);
        int i = binary.length()-1;
        while(binary.charAt(i)=='0') {
            i--;
        }

        System.out.println(i);
        int gap = 0;
        int counter = 0;
        for(; i>=0; i--) {
            if(binary.charAt(i)=='1') {
                gap = Math.max(gap, counter);
                counter = 0;
            } else {
                counter++;
            }
        }
        gap = Math.max(gap, counter);
        System.out.println("gap: " +gap);
        return gap;

    }


    public static void main(String[] args) {
        BinaryGapCount binaryGapCount = new BinaryGapCount();
        binaryGapCount.solution(1041);
    }
}
