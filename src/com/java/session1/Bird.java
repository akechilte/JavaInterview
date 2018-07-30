package com.java.session1;

/**
 * Created by mbiswas on 2/28/18.
 */
public class Bird extends Animal{

    public Bird(int age, String gender, int weightInLabs) {
        super(age, gender, weightInLabs);
    }

    @Override
    public void move() {
        System.out.println("Flapping wings.........I am in Bird class");
    }

//    public void fly(){
//        System.out.println("Flying........I am in Bird class");
//    }
}
