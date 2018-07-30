package com.java.session1;

/**
 * Created by mbiswas on 2/28/18.
 */
public class Sparrow extends Bird implements Flyable{

    public Sparrow(int age, String gender, int weightInLabs) {
        super(age, gender, weightInLabs);
    }

    @Override
    public void fly() {
        System.out.println("Flying.....implemented in Sparrow class from Flyable Interface");
    }
}
