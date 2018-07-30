package com.concept.comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by mbiswas on 6/4/18.
 */

// Read concept: https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
public class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;
    private int price;



    //Constructor
    public Movie(String name, double rating, int year, int price){
        this.name = name;
        this.rating = rating;
        this.year = year;
        this.price = price;
    }



    // getter method to access the private data
    public double getRating(){
        return rating;
    }

    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public int getPrice(){
        return price;
    }


//    @Override
//    public int compareTo(Movie m) {
//        return this.price - m.price;
//    }

    @Override
    public int compareTo(Movie m) {
        return this.name.compareTo(m.name);
    }



    public static void main(String[] args){
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015,10));
        list.add(new Movie("Star Wars", 8.7, 1977,20));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980,5));
        list.add(new Movie("Return of the Jedi", 8.4, 1983,12));

        Collections.sort(list);

        for(Movie movie : list){
            System.out.println(movie.getName() + " " + movie.getRating() +" "+ movie.getYear()+ " " + movie.getPrice());
        }
    }
}
