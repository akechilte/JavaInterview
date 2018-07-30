package com.stringProblem;

import java.util.Scanner;

/**
 * Problem: swapping two variables without using temp or third variable
 * Created by mbiswas on 4/12/18.
 */
public class Swapingtwonumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scan.nextInt();
        scan.close();

        System.out.println(" Before swap-----"+ "  a: " +a +"  b: " +b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" After swap-----"+ "  a: " +a +"  b: " +b);


    }












}
