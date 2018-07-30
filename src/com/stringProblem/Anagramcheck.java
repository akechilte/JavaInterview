package com.stringProblem;

import java.util.Scanner;

/**
 * Java program - String Anagram Example. * This program checks if two Strings are anagrams or not
 * Created by mbiswas on 4/12/18.
 */
public class Anagramcheck {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Word1: ");
        String word1 = scan.next();
        System.out.println("Word2: ");
        String word2 = scan.next();
        scan.close();

        if(word1 != null && word2 != null) {
            if (isAnagram(word1, word2)) {
                System.out.println("They are Anagram");
            } else {
                System.out.println("They are Anagram");
            }
        }else{
            System.out.println("There were no String input. try again");
        }

    }


    /** One way to find if two Strings are anagram in Java. This method
       * assumes both arguments are not null and in lowercase.
       *
       * @return true, if both String are anagram

     */
    public static boolean isAnagram(String word1, String word2){

        if(word1.length() != word2.length()){
            return false;
        }

        char[] charArray = word1.toCharArray();

        for(char c : charArray){
            int index = word2.indexOf(c);

            if(index != -1){
                word2 = word2.substring(0,index) + word2.substring(index +1, word2.length()); //substring(start from that index, end index -1)
            }else{
                return false;
            }
        }

        return word2.isEmpty();
    }


}
