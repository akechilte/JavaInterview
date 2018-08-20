package com.company.Yahoo;

/**
 * Created by mbiswas on 8/18/18.
 */
//151. Reverse Words in a String
public class ReverseWords {
    public String reverseWords(String s){
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length-1; i>=0; i--){
            if(!str[i].equals("") && !str[i].equals(" ")){
                sb.append(str[i] + " ");
            }
        }

        return sb.length() == 0 ? "" : sb.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWords r = new ReverseWords();
        System.out.println(r.reverseWords(" My  name  is malabika "));
    }
}
