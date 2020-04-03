package com.example.recyclerview;

import java.util.ArrayList;

public class MovieData {
    public static ArrayList<Movie> getMovies() {
        ArrayList<Movie> movies = new ArrayList<Movie>();

        movies.add(new Movie("Avengers: Endgame","fantasy", 2019));
        movies.add(new Movie("Avengers: Infinity War","fantasy", 2018));
        movies.add(new Movie("Avengers: Age of Ultron","fantasy", 2015));

        return movies;
    }
}