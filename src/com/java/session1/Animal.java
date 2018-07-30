package com.java.session1;

/**
 * Created by mbiswas on 2/28/18.
 * Abstact class: This is used for inheritance. You can not create instances of an Absttract class.
 * This is usually a parent class and expect child class to implemnts abstarct method.
 */
public abstract class Animal {

    int age;
    String gender;
    int weightInLabs;

    public Animal(int age, String gender, int weightInLabs) {
        this.age = age;
        this.gender = gender;
        this.weightInLabs = weightInLabs;
    }

     public void eat(){
         System.out.println("Eating........I am in Animal class");
     }

     public void sleep(){
         System.out.println("Sleeping.......I am in Animal class");
     }

     //abstract method
     public abstract void move();
}
