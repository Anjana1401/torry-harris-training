package com.torryharris.model;

public class Titanic implements Boat{
    @Override
    public void floats() {
        System.out.println("Boats can float on water.");
    }

    @Override
    public void move() {
        System.out.println("Boats can Move.");
    }
}
