package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mbiswas on 7/30/18.
 */
//442. Find All Duplicates in an Array
public class DuplicatesInArray {

    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i]) +1);
                result.add(nums[i]);
            }
        }

        return result;

    }

    public static void main(String[] args) {

    }
}
