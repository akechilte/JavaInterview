package com.company.coinbase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dbiswas on 7/21/18.
 */

//	1. Fizz Buzz problem
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
     List<String> list = new ArrayList<>();
        for(int i = 1; i<=n; i++) {
            if (i % 3 == 0 && i % 5 == 0) list.add("FizzBuzz");
            else if (i % 3 == 0) list.add("Fizz");
            else if (i % 5 == 0) list.add("Buzz");
            else list.add(String.valueOf(i));
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print the number");
        int n = scan.nextInt();
        FizzBuzz sol = new FizzBuzz();
        for(String s :sol.fizzBuzz(n)){
            System.out.println(s);
        }


    }
}
