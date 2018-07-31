package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mbiswas on 7/30/18.
 */

//412. Fizz Buzz
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1; i<= n; i++){

            if((i % 3 == 0) && (i % 5 == 0)){
                list.add("FizzBuzz");
            }else if(i % 3 == 0){
                list.add("Fizz");
            }else if(i % 5 == 0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }

        }

        return list;
    }


    public static void main(String[] args) {

    }
}
