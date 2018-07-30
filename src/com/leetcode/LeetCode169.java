package com.leetcode;

import java.util.Arrays;

/**
 * Created by mbiswas on 6/13/18.
 */
public class LeetCode169 {


    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }


    public static void main(String[] args) {
//        int[] array = {2,2,3,3,1,1,1,2,3,2,1,1,3,3,3,4,5,5,5,5,5,5,5,5,5,4};
        int[] array = {2,1,2,4,7};
        System.out.println(majorityElement(array));
    }
}
