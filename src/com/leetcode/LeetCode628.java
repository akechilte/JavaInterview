package com.leetcode;

import java.util.Arrays;

/**
 * Created by mbiswas on 6/16/18.
 */
public class LeetCode628 {

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        //think after sorting array is : [-5,-3,-2,1,4,8,12] max product can be either-> (-5 * -3 * 12) or (12 * 8 *4)
        return Math.max((nums[0] * nums[1] * nums[nums.length - 1]) ,
                (nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]));

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(maximumProduct(arr));
    }
}
