package com.torryharris.comparator;

import com.torryharris.model.Movie;

import java.util.Comparator;

public class MovieImdbratingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie q1, Movie q2) {
        return (q2.getImdbrating().compareTo(q1.getImdbrating()));
    }

}
