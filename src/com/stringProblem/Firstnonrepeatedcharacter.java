package com.stringProblem;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
/**
 * Problem : Java Program to find first non-repeated character in a String.
 * Created by mbiswas on 4/13/18.
 */
public class Firstnonrepeatedcharacter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String word = scan.next();
        scan.close();

        System.out.println("First non-repeated character in a String :" +getFirstNonRepeatedChar(word));
    }


    /** Using LinkedHashMap to find first non repeated character of String
       * Algorithm :
       *            Step 1: get character array and loop through it to build a
       *                    hash table with char and their count.
       *
       *            Step 2: loop through LinkedHashMap to find an entry with
       *                    value 1, that's your first non-repeated character,
       *                    as LinkedHashMap maintains insertion order.
      */

    public static char getFirstNonRepeatedChar(String str) {
        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
        char[] charArray = str.toCharArray();
        for(char c : charArray){
            counts.put(c, counts.containsKey(c) ? counts.get(c)+1 : 1);
        }

        for (Entry<Character,Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new RuntimeException("didn't find any non repeated Character");
    }
}
