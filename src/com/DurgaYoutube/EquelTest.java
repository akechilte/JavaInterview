package com.DurgaYoutube;

/**
 * Created by mbiswas on 4/18/18.
 */
public class EquelTest {

    public static void main(String[] args) {
        String s1 = new String("10");
        String s2 = new String("10");


        System.out.println(s1 == s2); // == operator only check same object or not
        System.out.println(s1.equals(s2)); // equals() only check for same content, no matter if its a same object or not

        //if s1.equals(s2) return true, then its hashCode should be same.
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

// Note: In String class, equals() and hasCode() are overriden from Object class. For our Customer or Student class we need to override
// those 2 methods ourself.
}
