package com.company.ebay;

import java.util.Stack;

/**
 * Created by mbiswas on 7/28/18.
 */

//https://www.youtube.com/watch?v=71kEvXsEKYQ
public class QueueUsingStack {

    Stack<Integer> stack = new Stack<>();
    int first; // we are using this for peek()

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack.isEmpty()){
            first = x;
        }
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int top = stack.pop();
        if(stack.isEmpty())
            return top;
        else
        {
            int result = pop();
            if(stack.isEmpty()){
                first = top;
            }
            stack.push(top);
            return result;
        }
    }

    /** Get the front element. */
    public int peek() {
        return first;
    }


    public static void main(String[] args) {
        QueueUsingStack qs = new QueueUsingStack();
        qs.push(1);
        qs.push(2);
        qs.push(3);
        qs.push(4);


        System.out.println(qs.peek());
        System.out.println(qs.pop());

        System.out.println(qs.peek());
        System.out.println(qs.pop());

        System.out.println(qs.peek());
        System.out.println(qs.pop());

        System.out.println(qs.peek());


    }
}
