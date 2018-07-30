package com.stringProblem;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Problem : Check if a String is a number or not using regular expression
 * Created by mbiswas on 4/13/18.
 */
public class CheckIfStringIsaNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = scan.next();
        scan.close();

        // Regular expression in Java to check if String is number or not
        Pattern pattern = Pattern.compile(".*[^0-9].*"); // Need to remember
/*      This is similar to above regex pattern, only difference is \D is replaced by [^0-9].
        By the way there is always multiple ways to check for certain things using regex.*/
        //Pattern pattern = Pattern.compile(".*/D.*";
        System.out.println( "does " + str + " is number : "
                + !pattern.matcher(str).matches());



        // Regular expression in java to check if String is 6 digit number or not
        Pattern digitPattern = Pattern.compile("\\d{6}");
        //Pattern digitPattern = Pattern.compile("\\d\\d\\d\\d\\d\\d"); // it will work same way

        System.out.println( "does " + str + " is 6 digit number : "
                + digitPattern.matcher(str).matches());



    }
}
