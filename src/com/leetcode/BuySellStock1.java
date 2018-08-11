package com.leetcode;

/**
 * Created by mbiswas on 8/11/18.
 */

//121. Best Time to Buy and Sell Stock
public class BuySellStock1 {
    public static int maxProfit(int[] prices) {

        if(prices == null || prices.length == 0)  return 0;

        int max_profit = 0;
        int sofarmin = prices[0];

        for(int i = 1; i< prices.length; i++){
            if(prices[i] > sofarmin){
                max_profit = Math.max(max_profit,prices[i] - sofarmin);
            }else{
                sofarmin = prices[i];
            }
        }

        return max_profit;

    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));

    }
}
