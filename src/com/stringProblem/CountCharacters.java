package com.stringProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Problem: count the number of occurrences of a character in String
 * Created by mbiswas on 4/13/18.
 */
public class CountCharacters {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = scan.next();
        scan.close();
        char[] characters = str.toCharArray();

        // build HashMap with character and number of times they appear in String
        Map<Character , Integer> charMap =  new HashMap<Character, Integer>();
        for(Character ch : characters){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1);
            }else{
                charMap.put(ch,1);
            }

        }


        // Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", str);

        for(Map.Entry<Character, Integer> entry : entrySet){

                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());

        }
    }
}
