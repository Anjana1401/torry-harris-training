package com.torryharris.driver;

import com.torryharris.comparator.MovieImdbratingComparator;
import com.torryharris.comparator.MovieNameComapartor;
import com.torryharris.model.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) {
        Movie m1=new Movie("Rangde",2002,7.2f, 100.00F);
        Movie m2=new Movie("Msdhoni",2019,9.8f,998.00F);
        Movie m3=new Movie("Thelab",2015,8.0f,963.00F);
        Movie m4=new Movie("Togo",2013,10.0f,978.00F);
        Movie m5=new Movie("FastandFurious",2005,7.5f,876.00F);

        ArrayList<Movie> movArrayList=new ArrayList<>();
        movArrayList.add(m1);
        movArrayList.add(m2);
        movArrayList.add(m3);
        movArrayList.add(m4);
        movArrayList.add(m5);
        System.out.println();
        System.out.println(movArrayList);
        System.out.println();
        System.out.println("Enter 1)Title,2)year,3)Imdbrating,4)Collection");


        Scanner scan=new Scanner(System.in);
int A=scan.nextInt();


        if(A==1) {
            movArrayList.sort(null);
            System.out.println("*******Sort by Tittle********");
            Iterator<Movie> movieIterator = movArrayList.iterator();
            while (movieIterator.hasNext()) {
                System.out.println(movieIterator.next());
            }
        }

        else if(A==2) {
            movArrayList.sort(new MovieNameComapartor());
            System.out.println("*******sort by year********");
            Iterator<Movie> movieIterator = movArrayList.iterator();
            while (movieIterator.hasNext()) {
                System.out.println(movieIterator.next());
            }
        }
        else if(A==3) {
            movArrayList.sort(new MovieImdbratingComparator());
            System.out.println("*******sort by imdbrating********");
            Iterator<Movie> movieIterator = movArrayList.iterator();
            while (movieIterator.hasNext()) {
                System.out.println(movieIterator.next());
            }
        }
        else {
            movArrayList.sort(new MovieNameComapartor());
            System.out.println("*******sort by Collection********");
            Iterator<Movie> movieIterator = movArrayList.iterator();
            while (movieIterator.hasNext()) {
                System.out.println(movieIterator.next());
            }
        }

    }
}
