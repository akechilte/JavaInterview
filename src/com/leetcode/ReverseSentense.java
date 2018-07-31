package com.company.ebay;


import java.util.Arrays;

/**
 * Created by mbiswas on 7/25/18.
 */
public class ReverseSentense {

    public static String reverse(String str){
        String[] arr = str.split(" ");
        StringBuffer sb = new StringBuffer(); //StringBuffer thread safe
        for(int i = arr.length-1; i>=0; i--){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "I am late";

        System.out.println(reverse(str));
    }
}
