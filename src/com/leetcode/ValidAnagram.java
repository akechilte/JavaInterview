package com.leetcode;

/**
 * Created by mbiswas on 6/15/18.
 */
//242. Valid Anagram
public class ValidAnagram {

    //Explanation: https://www.youtube.com/watch?v=ikO4qKG_IWc
    public static boolean isAnagram(String s, String t) {
        if(s == null || t == null){
            return false;
        }

        if(s.length() != t.length()){
            return false;
        }

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        int[] letters = new int[26];
        for(int i = 0; i< charArray1.length ; i++){
            // charArray1[0] - 'a' = 'a' - 'a' = 97 - 97 = 0 [this calculation to get the index for next step]
            //++ means letters[0] = letters arrayrs 0th position value + 1;
            letters[charArray1[i] - 'a']++;
        }

        for(int i = 0; i< charArray2.length ; i++){
            letters[charArray2[i] - 'a']--;
        }

        for(int letter : letters){
            if(letter != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram" , "nagaram"));
    }
}
