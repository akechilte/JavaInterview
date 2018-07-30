package com.datastructure.stack;

/**
 * Created by mbiswas on 3/21/18.
 */
public class App {

    public static void main(String[] args){
        Stack myStack = new Stack(2);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);



        while(!myStack.isStackEmpty()){
            System.out.println(myStack.pop());
        }
    }
}
