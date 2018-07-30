package com.datastructure.lesson1;

/**
 * Created by mbiswas on 3/19/18.
 */
public class Counter {

    //abstarct data
    String name = null;
    int value = 0;

    public Counter(String str) {
        this.name = str;
    }


    public void increment(){
        value++;

    }


    public int getCurrentValue(){
        return value;
    }

    public String toString(){
        return name + ":" +value;
    }
}
