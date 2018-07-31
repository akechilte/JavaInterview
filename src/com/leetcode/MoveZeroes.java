package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//283. Move Zeroes
public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(nums[j] == 0){
                j++;
            }else{
                nums[i] = nums[j];
                i++;
                j++;
            }
        }

        while(i < nums.length){
            nums[i] = 0;
            i++;
        }

    }

    public static void main(String[] args) {

    }
}
