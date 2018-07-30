package com.datastructure.lesson1;

/**
 * Created by mbiswas on 3/19/18.
 */
public class App {

    public static void main (String[] agrs){
        Counter myCounter = new Counter("myCounter");
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();

        System.out.println(myCounter.getCurrentValue());

    }
}
