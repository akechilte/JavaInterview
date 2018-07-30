package com.company.coinbase;

import java.util.Arrays;

/**
 * Created by dbiswas on 7/21/18.
 */

//https://leetcode.com/problems/unique-paths-ii/description/
//YouTube: https://www.youtube.com/watch?v=AmRvCR6B5no&t=481s
public class UniquePaths2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null||obstacleGrid.length==0)
            return 0;

        int m = obstacleGrid.length; //row
        int n = obstacleGrid[0].length; //col

        if(obstacleGrid[0][0]==1||obstacleGrid[m-1][n-1]==1) //obstacle in starting and finish place
            return 0;


        int[][] dp = new int[m][n];
        dp[0][0]=1;

        //left column
        for(int i=1; i<m; i++){
            if(obstacleGrid[i][0]==1){
                dp[i][0] = 0;  // if obstacle then assign 0
            }else{
                dp[i][0] = dp[i-1][0]; // get previous row value like: dp[0][0] = 1, dp[1][0] = dp[0][0], dp[2][0] = dp[1][0]
            }
        }
        System.out.println("left column--------------");
        for (int[] row : dp){
            System.out.println(Arrays.toString(row));
        }

        //top row
        for(int i=1; i<n; i++){
            if(obstacleGrid[0][i]==1){
                dp[0][i] = 0; // if obstacle then assign 0
            }else{
                dp[0][i] = dp[0][i-1]; // get previous col value like: dp[0][0] = 1, dp[0][1] = dp[0][0], dp[0][2] = dp[0][1]
            }
        }

        System.out.println("top row--------------");
        for (int[] row : dp){
            System.out.println(Arrays.toString(row));
        }



        System.out.println("***************--------------");
        for (int[] row : obstacleGrid){
            System.out.println(Arrays.toString(row));
        }

        //fill up cells inside
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }

            }
        }


        System.out.println("fill up cells inside--------------");
        for (int[] row : dp){
            System.out.println(Arrays.toString(row));
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0,1,1,0},
                {0,0,0,0},
                {1,0,0,0},
                {0,1,0,0}
        };

        System.out.println(uniquePathsWithObstacles(arr));
    }
}
