package com.example.recyclerview;

public class Movie {
    private String name;
    private String genre;
    private int year;

    public Movie(String name, String genre, int year) {
        this.name = name;
        this.genre = genre;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }
}