package com.torryharris.model;

public class Tiger implements Mamal{
    @Override
    public void feed() {
        System.out.println("Tiger is feeing Meat to its cub");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating Meat");
    }
}
