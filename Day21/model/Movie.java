package com.torryharris.model;

public class Movie implements Comparable<Movie> {
    private String title;
    private int year;
    private Float imdbrating;
    private Float collectin;

    public Movie() {
    }

    public Movie(String title, int year, float imdbrating, Float collectin) {
        this.title = title;
        this.year = year;
        this.imdbrating = imdbrating;
        this.collectin = collectin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Float getImdbrating() {
        return imdbrating;
    }

    public void setImdbrating(Float imdbrating) {
        this.imdbrating = imdbrating;
    }

    public Float getCollectin() {
        return collectin;
    }

    public void setCollectin(Float collectin) {
        this.collectin = collectin;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", imdbrating=" + imdbrating +
                ", collectin=" + collectin +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return this.title.compareTo(o.title);
    }


    public int getyear() {
        return year;
    }
}
