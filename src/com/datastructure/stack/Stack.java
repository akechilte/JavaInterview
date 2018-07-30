package com.datastructure.stack;

import java.util.EmptyStackException;

/**
 * Created by mbiswas on 3/21/18.
 *
 */
public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;


    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long element){
        if(isStackFull()){
            System.out.println("Stack is full.......");
        }else {
            top++;
            stackArray[top] = element;
        }
    }

    public long pop(){
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
