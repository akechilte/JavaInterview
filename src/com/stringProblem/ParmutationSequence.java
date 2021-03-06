package com.stringProblem;

import java.util.ArrayList;

/**
 * Created by dbiswas on 7/16/18.
 */
public class ParmutationSequence {

    public static String getPermutation(int n, int k) {

        // initialize all numbers
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            numberList.add(i);
        }

        // change k to be index
        k--;

        System.out.println(k);

        // set factorial of n
        int mod = 1;
        for (int i = 1; i <= n; i++) {
            mod = mod * i;
        }

        String result = "";

        // find sequence
        for (int i = 0; i < n; i++) {
            mod = mod / (n - i);
            // find the right number(curIndex) of
            int curIndex = k / mod;
            // update k
            k = k % mod;
            // get number according to curIndex
            result += numberList.get(curIndex);
            // remove from list
            numberList.remove(curIndex);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(getPermutation(3,3));

    }
}
