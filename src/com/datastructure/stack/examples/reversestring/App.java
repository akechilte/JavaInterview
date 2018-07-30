package com.datastructure.stack.examples.reversestring;

/**
 * Created by mbiswas on 3/21/18.
 */
public class App {

    public static void main(String[] args){
        String input = "MALABIKA"; // Input String
        int maxsize = input.length(); //Stack max size
        ReverseString myStack = new ReverseString(maxsize);

        for(int i = 0; i<maxsize; i++){
            myStack.push(input.charAt(i));

        }



        String result = "";
        while(!myStack.isStackEmpty()){
            char temp = myStack.pop();
            result = result+temp;
        }

        System.out.println(result);
    }

}
