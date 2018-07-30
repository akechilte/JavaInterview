package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mbiswas on 7/10/18.
 */
public class LeetCode624 {

    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);

        int result = Integer.MIN_VALUE;

        for(int i=1; i<arrays.size(); i++){
            int curmax = arrays.get(i).get(arrays.get(i).size()-1);
            int curmin = arrays.get(i).get(0);
            result = Math.max(result, Math.abs(max - curmin));
            result = Math.max(result, Math.abs(min - curmax));

            max = Math.max(max, curmax);
            min = Math.min(min, curmin);
        }

        return result;
    }


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(5);

        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);

        int result = new LeetCode624().maxDistance(list);

        System.out.println(result);


    }
}
