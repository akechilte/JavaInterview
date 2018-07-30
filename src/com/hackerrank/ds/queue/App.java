package com.hackerrank.ds.queue;

/**
 * Created by mbiswas on 5/15/18.
 */
public class App {

    public static void main(String[] args) {

        Queue queue = new Queue();

        for(int i = 1; i<=10; i++){
            queue.add(i);
        }



        System.out.println("isEmpty: " +queue.isEmpty());
        System.out.println("peek: " +queue.peek());


        for(int i = 1; i<=10; i++){
            System.out.println("remove: " +queue.remove());
        }


        System.out.println("isEmpty: " +queue.isEmpty());



    }
}
