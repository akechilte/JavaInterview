package com.stringProblem;

import java.util.Scanner;

/**
 * Problem " Reverse String in Java using Iteration and Recursion
 * Created by mbiswas on 4/13/18.
 */


/*  Important Note: Recursive solution is just for demonstrative and education purpose, don’t use recursive solution in production code
    as it may result in StackOverFlowError if String to be reversed is very long String or if you have any bug in your
    reverse function, anyway its good test to make yourself comfortable with recursive functions in java.
   */
public class ReverseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String :");
        String str = scan.next();
        scan.close();

    // Reverse String using StringBuffer
        String reverseString = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String in Java using StringBuffer: " +reverseString);


     // iterative method to reverse String in Java
        reverseString = reverse(str);
        System.out.println("Reverse String in Java using Iteration: " +reverseString);

     // recursive method to reverse String in Java
        String reverseString1 = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " +reverseString1);
    }




    public static String reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] charArray = str.toCharArray();
        for(int i = charArray.length-1; i>=0 ; i--){
            stringBuilder.append(charArray[i]);
        }
        return stringBuilder.toString();
    }

    // Explanation : https://www.youtube.com/watch?v=SrZvSWO2C5A
    public static String reverseRecursively(String str){

        //base case to handle one char string and empty string
        if (str.length() == 0) {
            return str;
        }
        System.out.println("str: " +str);
        System.out.println("str.charAt(0): " +str.charAt(0));
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
}
