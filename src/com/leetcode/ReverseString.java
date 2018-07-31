package com.company.coinbase;

/**
 * Created by dbiswas on 7/23/18.
 */
public class ReverseString {

    public static String reverse(String str){
        if(str == null ||str.length() == 1) return str;
        int i = 0;
        int j = str.length() - 1;
        char[] result = str.toCharArray();
        while(i < j){
            char temp = result[i];
            result[i] = result[j];
            result[j] = temp;
            i++;
            j--;
        }

        return new String(result);
    }



    public static String inPlaceReverse(final String input) {
        final StringBuilder builder = new StringBuilder(input);
        int length = builder.length();
        for (int i = 0; i < length / 2; i++)
        {
            final char current = builder.charAt(i);
            final int otherEnd = length - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd)); // swap
            builder.setCharAt(otherEnd, current);
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        System.out.println(reverse("Malabika"));
    }
}
