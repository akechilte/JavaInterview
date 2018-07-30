package com.company.coinbase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dbiswas on 7/21/18.
 */

//Given an array of integers, return indices of the two numbers such that they substract and get a specific target.
public class TwoSum {

    public static int[] twosum(int[] arr, int target){
        //[{2,0},{5,1},{}]
        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            int temp = arr[i] - target;
            if(map.containsKey(temp)){
                return new int[] {map.get(temp),i};
            }
            map.put(arr[i],i);
        }
        throw new IllegalArgumentException("No value found");

    }


    public static void main(String[] args) {
        //int[] arr = {2,5,8,12,16};
        int[] arr = {16,2,12,5,3};
        int target = 7;
        System.out.println(Arrays.toString(twosum(arr,target)));
    }
}
