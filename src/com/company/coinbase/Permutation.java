package com.company.coinbase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dbiswas on 7/21/18.
 */


public class Permutation {

    public List<int[]> listPermutations(int[] a) {
        ArrayList<int[]> results= new ArrayList<int[]>();
        listPermutations(a, 0, results);
        return results;
    }

    private void listPermutations(int[] a, int start, List<int[]> result) {
        if (start >= a.length) {
            result.add(a.clone());
        } else {
            for (int i = start; i < a.length; i++) {
                swap(a, start, i);
                listPermutations(a, start+1, result);
                swap(a, start, i);
            }
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void main(String[] args) {
        Permutation p = new Permutation();
        int[] a = {1,2,3,4};
        System.out.println(p.listPermutations(a));
        int[] result = p.listPermutations(a).get(8);
        System.out.println(Arrays.toString(result));



    }
}
