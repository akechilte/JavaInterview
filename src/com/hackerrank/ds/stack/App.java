package com.hackerrank.ds.stack;

/**
 * Created by mbiswas on 5/15/18.
 */
public class App {

    public static void main(String[] args) {

        Stack stack =  new Stack();

        for(int i = 1; i <=10; i++){
            stack.push(i);
        }

        System.out.println("isEmpty: " +stack.isEmpty());
        System.out.println("peek: " +stack.peek());

        for(int i = 1; i <=10; i++){
            System.out.println("pop: "+stack.pop());
        }

        System.out.println("isEmpty: " +stack.isEmpty());
    }
}
