package com.concept.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by mbiswas on 6/4/18.
 */

// Concept : https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
public class Movie {

    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }


    public String getName(){
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear(){
        return year;
    }


    public static void main(String[] args){

        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Anonymous class signature
        Comparator<Movie> sortingByName = new Comparator<Movie>(){

            @Override
            public int compare(Movie m1, Movie m2) {
                return m1.getName().compareTo(m2.getName());
            }
        };




        // Anonymous class signature
        Comparator<Movie> sortingByYear = new Comparator<Movie>(){

            @Override
            public int compare(Movie m1, Movie m2){
                return m1.getYear() - m2.getYear();
            }


        };



        // Anonymous class signature
        Comparator<Movie> sortingByRating = new Comparator<Movie>(){
            @Override
            public int compare(Movie m1, Movie m2){
                if(m1.getRating() > m2.getRating()){
                    return 1;
                }else if(m1.getRating() < m2.getRating()){
                    return -1;
                }
                return 0;
            }

        };

        //sorted by name
        Collections.sort(list,sortingByName);
        System.out.println("Sorting by Movie Name---------------------");
        for(Movie movie : list){
            System.out.println(movie.getName() + " " + movie.getRating() +" "+ movie.getYear());
        }


        //sorted by year
        Collections.sort(list,sortingByYear);
        System.out.println("Sorting by Year---------------------");
        for(Movie movie : list){
            System.out.println(movie.getName() + " " + movie.getRating() +" "+ movie.getYear());
        }



        //sorted by rating
        Collections.sort(list,sortingByRating);
        System.out.println("Sorting by Rating-------------------");
        for(Movie movie: list){
            System.out.println(movie.getName() +" " +movie.getRating() +" "+ movie.getYear());
        }


    }
}
