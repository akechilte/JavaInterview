package com.company.coinbase;

/**
 * Created by dbiswas on 7/23/18.
 */
public class Palindrom {

    public static boolean isPalindrome(String str){
        if(str == null || str.length() == 0 || str.isEmpty()) return false;

        for(int i = 0; i< str.length()-1; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba"));
    }
}
