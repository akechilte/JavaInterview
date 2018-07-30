package com.company.ebay;

import java.util.Stack;

/**
 * Created by mbiswas on 7/28/18.
 */

//https://www.youtube.com/watch?v=AN0axYeLue0
public class QueueUsingTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    /** Returns size of the queue */
    public int size() {
        return stack1.size() + stack2.size();
    }


    public static void main(String[] args) {
        QueueUsingTwoStacks qs = new QueueUsingTwoStacks();
        qs.push(1);
        qs.push(2);
        qs.push(3);
        qs.push(4);


        System.out.println(qs.peek());

        System.out.println(qs.pop());
        System.out.println(qs.pop());
        System.out.println(qs.pop());

        System.out.println(qs.peek());

    }

}
