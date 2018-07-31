package com.company.ebay;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by mbiswas on 7/28/18.
 */

//https://leetcode.com/articles/implement-stack-using-queues/
public class StackUsingQueue {

    Queue<Integer> q = new LinkedList<>();

    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        int size = q.size();
        while(size>1){
            q.add(q.remove());
            size--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.remove();
    }

    /** Get the top element. */
    public int top() {
        return q.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue sq = new StackUsingQueue();
        sq.push(1);
        sq.push(2);
        sq.push(3);
        sq.push(4);


        System.out.println(sq.top());
        System.out.println(sq.pop());

        System.out.println(sq.top());
        System.out.println(sq.pop());

        System.out.println(sq.top());
        System.out.println(sq.pop());

        System.out.println(sq.top());


    }
}
