package com.company.ebay;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by mbiswas on 7/28/18.
 */


//https://leetcode.com/articles/implement-stack-using-queues/
public class StackUsing2Queues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    /** Push element x onto stack. */
    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q1.remove();
    }

    /** Get the top element. */
    public int top() {
        return q1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsing2Queues sq = new StackUsing2Queues();
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
