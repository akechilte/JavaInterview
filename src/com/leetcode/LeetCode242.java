package com.leetcode;

/**
 * Created by mbiswas on 6/15/18.
 */
public class LeetCode242 {

    public static boolean isAnagram(String s, String t) {
        if(s==null || t==null)
            return false;

        if(s.length()!=t.length())
            return false;

        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            //int temp = arr[s.charAt(i) - 25];
            int temp1 = arr[s.charAt(i)-'a'];
            //int temp2 = arr[s.charAt(i)-'a']++;
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;

        }

        for(int i: arr){
            if(i!=0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram" , "nagaram"));
    }
}
