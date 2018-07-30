package com.stringProblem;


import java.util.Scanner;

/**
 * Problem : Count number of vowels in given String
 * Created by mbiswas on 4/13/18.
 */
public class VowelCounter {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = scan.next();
        scan.close();


        char[] charArray = str.toCharArray();
        int vowel = 0;
        for( char c: charArray){
            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowel++;

                default:
                // do not increment
            }

        }

        System.out.println("Vowels count in this String is : " +vowel);
    }
}
