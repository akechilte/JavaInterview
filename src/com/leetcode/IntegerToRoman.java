package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//12. Integer to Roman
public class IntegerToRoman {
    public String intToRoman(int num) {

        if(num > 3999 || num < 1)  throw new IllegalArgumentException();

        String[] values = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while(num > 0){
            if(num - nums[i] >= 0){
                sb.append(values[i]);
                num = num - nums[i];
            }else{
                i++;
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {

    }
}
