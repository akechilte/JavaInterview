package com.hackerrank.challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by mbiswas on 5/31/18.
 */
public class Practice {



    public static void removeDuplicateString(String str){

        Set<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i<str.length(); i++){
            Character temp = str.charAt(i);
            if(!set.contains(temp)){
                set.add(temp);
                sb.append(temp);
            }
        }

        System.out.println(sb.toString());

    }


    public static void printDuplicateCharacters(String str){

        Map<Character, Integer> map = new HashMap<>();
        char[] characters = str.toCharArray();

        for(Character ch : characters){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch, map.get(ch)+1);
            }
        }

        //Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
    }




    public static void duplicateStringInArray(){

        String[] elements = new String[] {"moon", "sun", "water", "soil", "blue", "red", "water", "pencil", "soil"};

        Set<String> duplicateSet = new HashSet<>();
        Set<String> nonduplicateSet = new HashSet<>();

        for(String str : elements){
            if(!nonduplicateSet.contains(str)){
                nonduplicateSet.add(str);
            }else{
                duplicateSet.add(str);
            }
        }

        System.out.println(duplicateSet);

    }


    public static void getMaxAndMinNumberInArray(){
        int[] elements = new int[] {8,2,3,4,5,7,3,10};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int element: elements){
            if(element > max){
                max = element;
            }else{
                min = element;
            }
        }

        System.out.println("MAX: " +max);
        System.out.println("MIN: " +min);
    }


    public static void vowelCount(String str){

        char[] charArray = str.toCharArray();
        char[] vowels = new char[] {'a','e','i','o','u'};
        Set<Character> set = new HashSet<>();
        int count = 0;

        for(char c : vowels){
            set.add(c);
        }

        for(char ch : charArray){
            if(set.contains(ch)){
                count++;
            }
        }

        System.out.println(count);


    }


    public static void reverseString(String str){

        if(str == null || str.length() <=1){
           System.out.println(str);
        }else{
            System.out.print(str.charAt(str.length() - 1));
            reverseString(str.substring(0,str.length() - 1));
        }

    }


    public static boolean palindrom(String str){

        int k = str.length() -1;

        //ABBA
        //ABCBA
        for(int i=0; i< str.length()/2; i++) {

            if(str.charAt(i) != str.charAt(k -i)){
                System.out.println("Not Palindrom");
                return false;
            }

            if (str.charAt(i) == str.charAt(k - i)) {
                continue;
            }

        }

        return true;

    }


    public static boolean palindromWithRecursion(String str){

        if(str.length() <= 1) {
            return true;
        }

        if(str.charAt(0) == str.charAt(str.length() - 1)){
                return palindromWithRecursion(str.substring(1,str.length()-1));
            }

        return false;

    }


    public static boolean isPrimeNumber(int num){
        for(int i = 2; i< num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }




    public static void fibonacci(int number){
//        if(number == 1 || number == 2) {
//            return 1;
//        }

        int fibo1=1, fibo2=1, fibonacci=1;
        System.out.print(fibo1);
        System.out.print(fibo2);
        for(int i= 3; i<= number; i++){ //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci);

        }

        //return fibonacci; //Fibonacci number

    }



    public static int fibonacciRecursion(int number){
        if(number == 1 || number == 2){
            return 1;
        }

        return fibonacciRecursion(number-1) + fibonacciRecursion(number -2); //tail recursion
    }


    public static int factorial(int num){
        if(num <= 1){
            return 1;
        }else{
            return num * factorial(num - 1);
        }
    }









    public static void main(String[] agrs){

        removeDuplicateString("MALABIKA");

        printDuplicateCharacters("MALABIKA");

        duplicateStringInArray();

        getMaxAndMinNumberInArray();

        vowelCount("malabika");

        reverseString("MALABIKA");

        System.out.println("Palindrom: " +palindrom("ABBA"));

        System.out.println("Palindrom: " +palindromWithRecursion("ABCDBA"));

        System.out.println("Prime: " +isPrimeNumber(23));

        fibonacci(5);

        System.out.println("");

        System.out.println("Factorial: " +factorial(5));



    }


}
