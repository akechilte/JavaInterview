package com.Interview;

/**
 * Created by mbiswas on 5/29/18.
 */
public class Problem {

    public static void main(String[] args) {

        System.out.println(encode("abcd"));
        System.out.println(encode(encode("abcd")));

    }
// encode code is given..write decode code
    private static String encode(String text) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.println(c);
            System.out.println(c + i);
            b.append(c += c + i);
        }
        return b.reverse().toString();
    }

    private static String decode(String text) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.println(c);
            System.out.println(c - 100);
            b.append(c -= c - 100);
        }
        return b.reverse().toString();
    }
}
