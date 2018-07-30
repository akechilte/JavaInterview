package com.company.coinbase;

/**
 * Created by dbiswas on 7/22/18.
 */

//Fibonacci
public class Fibonacci {

    public static int fibonacci(int n){
        if(n == 1 || n == 2) return 1;
        int first = 1;
        int second = 1;
        for(int i = 3; i<=n; i++){
            int temp = first;
            first = second;
            second = temp + second;
        }
        return second;
    }

    public static int fibonacciRecursion(int n){
        if(n==1 || n==2) return 1;

        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=5; i++){
            System.out.println(fibonacciRecursion(i));
        }
    }
}
