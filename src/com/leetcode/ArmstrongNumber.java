package com.leetcode;

/**
 * Created by mbiswas on 8/1/18.
 */
public class ArmstrongNumber {

    public static boolean isArmstrong(int num){
        int val = num;
        int result = 0;
        while(num != 0){
            int temp = num % 10; // last digit
            result += (int)Math.pow(temp,3);
            System.out.println(result);
            num = num /10;

        }

        if(result == val){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(371));
    }
}
