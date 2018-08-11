package com.leetcode;

/**
 * Created by mbiswas on 8/11/18.
 */
public class BuySellStock3 {
    public static int maxProfit(int[] prices) {
        int buyOne = Integer.MAX_VALUE;
        int sellOne = 0;
        int buyTwo = Integer.MAX_VALUE;
        int sellTwo = 0;

        for(int p : prices){
            buyOne = Math.min(buyOne , p);
            sellOne = Math.max(sellOne, p - buyOne);
            buyTwo = Math.min(buyTwo, p - sellOne);
            sellTwo = Math.max(sellTwo, p - buyTwo);
        }

        return sellTwo;

    }

    public static void main(String[] args) {
        int[] arr = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(arr));
    }
}
