package com.driver;

public class Director {
    private  String name;
    private int numberOfMovies;
    private  double imdbRating;

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Director(String name,int numberOfMovies,double imdbRating) {
        this.name=name;
        this.numberOfMovies=numberOfMovies;
        this.imdbRating=imdbRating;
    }

    public Director() {
    }
}
