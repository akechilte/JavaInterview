package com.stringProblem;

import java.util.Scanner;

/**
 * Created by mbiswas on 4/9/18.
 */
public class FibonacciCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        scan.close();

        System.out.println("Fibonacci series upto " + num +" numbers : ");

        int a[] = new int[num];
        int j = 0;



        //printing Fibonacci series upto number
        for(int i=1; i<=num; i++){
            int value = fibonacciRecursion(i);
            a[j] = value;
            j++;
            System.out.print(value +" ");
        }


        //printing Fibonacci series reverse way
        System.out.println("");
        System.out.println("Fibonacci in reverse way: ");
        for(int x=a.length-1; x>=0; x--){
            System.out.print(a[x] + " ");
        }

    }





    /** Java program for Fibonacci number using recursion.
     * This program uses tail recursion to calculate
     * Fibonacci number for a given number * @return Fibonacci number
    */

    public static int fibonacciRecursion(int number){
        if(number == 1 || number == 2){
            return 1;
        }

        return fibonacciRecursion(number-1) + fibonacciRecursion(number -2); //tail recursion
    }






    /** Java program to calculate Fibonacci number using loop or Iteration.
    * @return Fibonacci number
    */

    public static int fibonacci(int number){
        if(number == 1 || number == 2) {
            return 1;
        }

        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){ //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }

        return fibonacci; //Fibonacci number

    }







}
