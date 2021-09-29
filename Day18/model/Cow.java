package com.torryharris.model;

public class Cow implements Mamal{

    @Override
    public void feed() {
        System.out.println("Cow is feeding Grass to its calf");
    }

    @Override
    public void eat() {
        System.out.println("cow is eating Grass");
    }
}
