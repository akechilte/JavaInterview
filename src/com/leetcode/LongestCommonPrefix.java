package com.leetcode;

/**
 * Created by mbiswas on 6/21/18.
 */

//14. Longest Common Prefix
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle))
                low = middle + 1;
            else
                high = middle - 1;
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private static boolean isCommonPrefix(String[] strs, int len){
        String str1 = strs[0].substring(0,len);
        for (int i = 1; i < strs.length; i++)
            if (!strs[i].startsWith(str1))
                return false;
        return true;
    }


    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};

        String arr1[] = {"leets", "leetcode",
                "leetc", "leeds"};

        System.out.println(longestCommonPrefix(arr1));

    }
}