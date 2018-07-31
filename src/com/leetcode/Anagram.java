package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//242. Valid Anagram
public class Anagram {

    public static boolean isAnagram(String str1, String str2){
        if(str1 == null || str2 == null) return false;
        if(str1.length() != str2.length()) return false;

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int[] result = new int[26];

        for(int i = 0; i< charArray1.length -1; i++){
            result[charArray1[i] - 'a']++;
        }

        for(int i = 0; i< charArray2.length -1; i++){
            result[charArray2[i] - 'a']--;
        }

        for(int r : result){
            if(r !=0 ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //String s = "anagram", t = "nagaram";
        String s = "rat", t = "car";
        System.out.println(isAnagram(s,t));

    }
}

