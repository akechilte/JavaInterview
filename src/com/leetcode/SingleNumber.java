package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mbiswas on 7/30/18.
 */
//136. Single Number
public class SingleNumber {

    //option1
    public int singleNumber1(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                result = entry.getKey();
                return result;
            }
        }

        return result;
    }


    //option2
    public int singleNumber2(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }


    public static void main(String[] args) {

    }
}
