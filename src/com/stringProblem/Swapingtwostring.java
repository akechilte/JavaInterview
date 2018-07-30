package com.stringProblem;

import java.util.Scanner;

/**
 * Created by mbiswas on 4/12/18.
 */
public class Swapingtwostring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String a = scan.next();
        System.out.println("Enter 2nd String: ");
        String b = scan.next();
        scan.close();

        System.out.println("Before swap: " + "  a :" +a +"  b: " +b);

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length()); // if one arg for substring, then its starting index, it will assume last index is the last of that word

        System.out.println("After swap: " + "  a :" +a +"  b: " +b);
    }
}
