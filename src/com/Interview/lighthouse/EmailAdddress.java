package com.Interview.lighthouse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mbiswas on 6/5/18.
 */
public class EmailAdddress {



    public String solution(String S, String C){
        String[] names = S.split(";"); //["Malabika Biswas" ," Dipankar Biswas", " Mridul Kanti Biswas", " ..."]
        String tail = "@" +C.toLowerCase() +".com"; //@example.com
        int count = 0;
        StringBuffer sb = new StringBuffer();
        Map<String,Integer> map = new HashMap<>();
        String nameWithEmail = "";

        for(String name : names){
            String nameAfterTrim = name.trim().replaceAll("[-]",""); // "Adhrit Ricky-Biswas  " ---> "Adhrit Ricky Biswas"
            if(!map.containsKey(nameAfterTrim)){
                count = 1;
                map.put(nameAfterTrim, count); // ("malabika biswas" , 1)
            }else{
                count = map.get(nameAfterTrim) + 1;
                map.put(nameAfterTrim, count); //("malabika biswas", 1+1)

            }
            nameWithEmail = nameAfterTrim +" <" +emailIdGenerator(nameAfterTrim.toLowerCase().trim(), tail, count) +">; ";
            sb.append(nameWithEmail);

        }

        return sb.toString();


    }


    public String emailIdGenerator(String str, String tail, int count){

        String[] name = str.split(" ");
        String email ="";
        String firstName = name[0];
        String lastName ="";

        if(count > 1){
            lastName = name[name.length - 1] + (count-1);
        }else{
            lastName = name[name.length - 1];
        }

        if(name.length == 2){ // malabika.biswas@example.com
            email = firstName +"." +lastName +tail;

        }else if(name.length == 3){
            email = firstName +"." +name[1] +lastName +tail;
        }
        return email;

    }




    public static void main(String[] args){
        String names = "Malabika Biswas; Dipankar Biswas; Mridul Kanti Biswas; Adhrit Ricky-Biswas; Malabika Biswas; Mridul Kanti Biswas ";
        String company = "Example";

        EmailAdddress emailAdddress = new EmailAdddress();
        System.out.println(emailAdddress.solution(names, company));


        /*
        Expected Output
        String output = "Malabika Biswas <malabika.biswas@example.com>; Dipankar Biswas <dipankar.biswas@example.com>; " +
                        "Mridul Kanti Biswas <mridul.kantibiswas@example.com>; Adhrit Ricky Biswas <adhrit.rickybiswas@example.com>; " +
                        "Malabika Biswas <malabika.biswas1@example.com>; Mridul Kanti Biswas <mridul.kantibiswas1@example.com>";

      */





    }

}
