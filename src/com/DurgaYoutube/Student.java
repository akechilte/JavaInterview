package com.DurgaYoutube;

/**
 * Explanation - toString() method
 * Created by mbiswas on 4/12/18.
 */
public class Student {

    String name;
    int roll;

    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student("Malabika", 101);
        Student s2 = new Student("Dipankar", 102);
        System.out.println(s1); // though didn't say s1.toString(), still internally its calling toString method.
        // if we don't override toString() then we are calling toString() from Object class. But here I already override toString() method.
        System.out.println(s2.toString());
    }
}
