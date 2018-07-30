package com.stringProblem;

import java.util.Scanner;

/**
 * Created by mbiswas on 4/9/18.
 * Java Program to check if a number is Prime or Not
 */
public class Primetest {
    public static void main(String[] args) { // psvm + tab
        Scanner scan = new Scanner(System.in); // alt + enter for resolving symbol
        System.out.println(); //sout + tab
        int number = scan.nextInt();
        scan.close();

        if(isPrime(number)){
            System.out.println("Its a prime number");
        }else{
            System.out.println("Its not a prime number");
        }

    }


    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2; i < Math.sqrt(num); i++){ // logic??
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
