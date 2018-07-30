package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */


public class LeetCode1 {


    //solution: https://leetcode.com/articles/two-sum/
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }




    public static void main(String[] args) {
        int[] array = {6,2,3,9,4};
        //int[] array = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(array,23);
        System.out.println(Arrays.toString(result));
    }
}
