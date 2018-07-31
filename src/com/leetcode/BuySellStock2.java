package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//122. Best Time to Buy and Sell Stock II
public class BuySellStock2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 1 ; i< prices.length; i++){
            int currentProfit = prices[i] - prices[i-1];
            if(currentProfit > 0){
                maxProfit +=currentProfit;
            }
        }

        return maxProfit;
    }


    public static void main(String[] args) {

    }
}
