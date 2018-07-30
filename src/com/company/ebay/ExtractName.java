package com.company.ebay;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mbiswas on 7/25/18.
 */
public class ExtractName {



    public static String getName(String str){

        String[] arr = str.split(" ");
        for(int i = 0; i<arr.length - 1; i++){
            if(arr[i].charAt(0) == '@'){
                return arr[i].substring(1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String str = "My name is @satyajit what is your name";
        System.out.println(getName(str));
    }
}
