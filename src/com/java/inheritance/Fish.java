package com.java.inheritance;

/**
 * Created by mbiswas on 2/28/18.
 */
public class Fish extends Animal{

    public Fish(int age, String gender, int weightInLabs) {
        super(age, gender, weightInLabs);
    }


    public void swim(){
        System.out.println("Swimming........I am in Fish class");
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming....I am in Fish class");
    }


}
