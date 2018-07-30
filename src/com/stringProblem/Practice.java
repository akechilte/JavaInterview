package com.stringProblem;

/**
 * Created by dbiswas on 7/16/18.
 */
public class Practice {

    public static int getFibonacci(int n){
        if(n == 1 || n == 2) return 1;

        int first = 1;
        int second = 1;

        for(int i = 3; i <= n ; i++){
            int temp = first + second;
            first = second;
            second = temp;
        }

        return second;
    }


    public static int getFibonacciRec(int n){
        if(n==1 || n== 2) return 1;

        return getFibonacciRec(n-1) + getFibonacciRec(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<= n; i++)
        System.out.print(getFibonacci(i) + " ");

        System.out.println();
        for(int i = n; i>= 1; i--)
            System.out.print(getFibonacci(i) + " ");

        System.out.println("Recursive way");
        for(int i = 1; i<= n; i++)
            System.out.print(getFibonacciRec(i) + " ");
    }
}
