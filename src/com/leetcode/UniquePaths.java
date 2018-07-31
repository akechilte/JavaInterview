package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//62. Unique Paths
public class UniquePaths {
    //YouTube : https://www.youtube.com/watch?v=GO5QHC_BmvM
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i==0||j==0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = grid[i][j-1] + grid[i-1][j];
            }
        }
        return grid[m-1][n-1];
    }

    public static void main(String[] args) {

    }
}
