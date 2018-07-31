package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//416. Partition Equal Subset Sum
    //Input: [1, 5, 11, 5]
    //Output: true
    //Explanation: The array can be partitioned as [1, 5, 5] and [11].
public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            sum = sum + nums[i];
        }

        if(sum % 2 != 0) return false;

        sum = sum / 2;

        boolean[][] T = new boolean[nums.length + 1][sum + 1] ; // +1 bcoz of element 0 in this 2D array

        for(int i = 0; i< T.length; i++){ // left most colom is assigning True
            T[i][0] = true;
        }

        // Actual logic
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j - nums[i - 1] >= 0) {
                    T[i][j] = T[i - 1][j] || T[i - 1][j - nums[i - 1]];
                } else {
                    T[i][j] = T[i-1][j];
                }
            }
        }
        return T[nums.length][sum];
    }

    public static void main(String[] args) {

    }
}
