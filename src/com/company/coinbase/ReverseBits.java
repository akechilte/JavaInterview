package com.company.coinbase;

/**
 * Created by dbiswas on 7/22/18.
 */

//https://leetcode.com/problems/reverse-bits/discuss/54738/Sharing-my-2ms-Java-Solution-with-Explanation
public class ReverseBits {

    public static int reverseBits(int n) {
        if (n == 0) return 0;

        int result = 0;
        for(int i = 0; i<32; i++){
            result = result << 1;
            if((n & 1) == 1)
                result++;
            n = n >> 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
}
