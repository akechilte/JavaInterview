package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//70. Climbing Stairs
public class ClimbingStairs {
    public int climbStairs(int n) {

        if(n == 1){
            return n;
        }

        int first = 1;
        int second = 2;

        for(int i = 3; i<=n ; i++){
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }

    public static void main(String[] args) {

    }
}
