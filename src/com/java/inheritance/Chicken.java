package com.java.inheritance;

/**
 * Created by mbiswas on 2/28/18.
 */
public class Chicken extends Bird {


    public Chicken(int age, String gender, int weightInLabs) {
        super(age, gender, weightInLabs);
    }

    //overriding the method define in Bird [Override= Replace]
    public void fly(){
        System.out.println("Can't fly.......I am in Chicken class");
    }



}
