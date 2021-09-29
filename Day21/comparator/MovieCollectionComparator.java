package com.torryharris.comparator;

import com.torryharris.model.Movie;

import java.util.Comparator;

public class MovieCollectionComparator implements Comparator<Movie> {


    @Override
    public int compare(Movie o1, Movie o2) {
        return  (o1.getCollectin().compareTo(o2.getCollectin()));
    }
}
