package com.leetcode;

/**
 * Created by mbiswas on 6/13/18.
 */
public class LeetCode171 {

    public static int titleToNumber(String s) {
        if(s==null || s.length() == 0){
            throw new IllegalArgumentException("Input is not valid!");
        }

        int result = 0;
        int i = s.length()-1;
        int t = 0;
        while(i >= 0){
            char curr = s.charAt(i);
            int temp1 = curr;
            int temp2 = 'A';
            int temp3 = (int) Math.pow(26, t);
            result = result + (int) Math.pow(26, t) * (curr-'A'+1);
            t++;
            i--;
        }

        return result;
    }


    public static void main(String[] args) {
        int result = titleToNumber("AB");
        System.out.println(result);
    }
}
