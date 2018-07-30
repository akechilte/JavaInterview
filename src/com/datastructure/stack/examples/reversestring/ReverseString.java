package com.datastructure.stack.examples.reversestring;

/**
 * Created by mbiswas on 3/21/18.
 *
 * Program: Reverse a String using Stack
 */
public class ReverseString {

    private int maxSize;
    private char[] stackArray;
    private int top;


    public ReverseString(int size){
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char element){
        if(isStackFull()){
            System.out.println("Stack is full.......");
        }else {
            top++;
            stackArray[top] = element;
        }
    }

    public char pop(){
        int old_top = top;
        top--;
        return stackArray[old_top];
    }

    public long peak(){
        return stackArray[top];
    }

    public boolean isStackEmpty(){
        return (top == -1);
    }

    public boolean isStackFull(){
        return ((maxSize-1) == top);
    }
}
