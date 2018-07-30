package com.codility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mbiswas on 6/6/18.
 */
public class UnpairedElement {

    public int solution(int[] A) {
        // write your code in Java SE 8

        Map<Integer, Integer> map = new HashMap<>();
        int output = 0;
        for(int i = 0; i<= A.length - 1; i++){
            if(!map.containsKey(new Integer(A[i]))){
                map.put(new Integer(A[i]), 1);
            }else{
                map.put(new Integer(A[i]),map.get(new Integer(A[i])) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                output = entry.getKey();
            }
        }

        return output;
    }

    public static void main(String[] args) {
        UnpairedElement unpairedElement = new UnpairedElement();
        int[] a = {2,5,3,7,1,2,7,5,1};
        System.out.println(unpairedElement.solution(a));
    }
}
