package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mbiswas on 6/13/18.
 */
//169. Majority Element
public class MajorityElement {


    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i]) +1);
            }
        }
        int maxCount = 0;
        int candidate = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            maxCount = Math.max(maxCount,entry.getValue());
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == maxCount){
                candidate = entry.getKey();
            }
        }
        if(maxCount == 0){
            return 0;
        }

        return (maxCount > nums.length/2 ? candidate : 0);
    }


    public static void main(String[] args) {
//        int[] array = {2,2,3,3,1,1,1,2,3,2,1,1,3,3,3,4,5,5,5,5,5,5,5,5,5,4};
        int[] array = {2,1,2,4,7};
        System.out.println(majorityElement(array));
    }
}
