package com.datastructure.queue;

/**
 * Created by mbiswas on 3/22/18.
 */
public class App {

    public static void main(String args[]){
        Queue myqueue = new Queue(5);
        myqueue.insert(1);
        myqueue.insert(2);
        myqueue.insert(3);
        myqueue.insert(4);
        myqueue.insert(5);

        myqueue.view();
        System.out.println(myqueue.remove());
        System.out.println(myqueue.remove());
    }
}
