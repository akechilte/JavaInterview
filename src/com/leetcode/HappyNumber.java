package com.leetcode;

import java.util.HashSet;

/**
 * Created by mbiswas on 6/16/18.
 */
public class HappyNumber {
    // note : Numbers that are happy, follow a sequence that ends in 1.
    //All non-happy numbers follow sequences that reach the cycle: 4, 16, 37, 58, 89, 145, 42, 20, 4, ...

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();

        while(!set.contains(n)){
            set.add(n);

            n = getSum(n);

            if(n==1)
                return true;
        }

        return false;
    }

    public static int getSum(int n){
        int sum =0;
        while(n>0){
            int temp = n%10;
            sum+=temp * temp;
            n=n/10;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(999));
    }
}
