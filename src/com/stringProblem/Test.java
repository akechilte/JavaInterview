package com.stringProblem;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by mbiswas on 7/30/18.
 */
public class Test implements Comparator<Test>{

 int dishSize;

    public static void main(String[] args) {
        Test[] va = {new Test(40),new Test(200), new Test(60)};
        Arrays.sort(va,va[0]);
        int index = Arrays.binarySearch(va,new Test(40), va[0]);
        System.out.print(index + " ");
        index = Arrays.binarySearch(va,new Test(80), va[0]);
        System.out.println(index);
    }

    @Override
    public int compare(Test a, Test b) {
        return b.dishSize - a.dishSize;
    }

    Test(int d){
        dishSize  = d;
    }
}


