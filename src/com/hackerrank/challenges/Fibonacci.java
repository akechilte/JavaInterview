package com.hackerrank.challenges;

/**
 * Created by mbiswas on 5/24/18.
 */
public class Fibonacci {

    //4 -> 1 1 2 3
    //5 -> 1 1 2 3 5
    //6-> 1 1 2 3 5 8
    public static int fibonacci(int n){
        //Base case
        if(n == 1 || n==2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i< n; i++) {
            System.out.print(fibonacci(n));
        }

        //System.out.print(fibonacci(5));
    }

}
