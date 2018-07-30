package com.company.coinbase;

import java.util.Scanner;

/**
 * Created by dbiswas on 7/21/18.
 */

//https://www.hackerrank.com/challenges/flipping-bits/problem
public class FlippingBits {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0; i<t; i++){
            int n = Integer.parseUnsignedInt(input.next());
            int p = 1;
            int j = 0;
            while(j<32){
                n = n ^ p; // input number XOR p [bits are different, it gives 1. If corresponding bits are same, it gives 0]
                p = p << 1;
                j++;
            }
            System.out.println(Integer.toUnsignedString(n));
        }
    }
}
