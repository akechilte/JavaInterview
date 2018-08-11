package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by mbiswas on 8/11/18.
 */
public class SortWithComparator {
    public static void main(String[] args) {
        String[] str = {"abc32","dcw12","abc4","sqa12"};

        Arrays.sort(str, new Comparator() {

            public int compare(Object o1, Object o2) {

                String x1 = ((String) o1);
                String x2 = ((String) o2);
                int sComp = x1.substring(0,3).compareTo(x2.substring(0,3));

                if (sComp != 0) {
                    return sComp;
                }

                Integer i = Integer.valueOf(((String) o1).substring(3));
                Integer j = Integer.valueOf(((String) o2).substring(3));
                return i.compareTo(j);
            }});

        System.out.println(Arrays.toString(str));


    }

}
