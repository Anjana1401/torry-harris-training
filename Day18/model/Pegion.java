package com.torryharris.model;

public class Pegion implements Bird{
    @Override
    public void fly() {
        System.out.println("pegion is flying higher.");
    }

    @Override
    public void eat() {
        System.out.println("pegion is eating grains. ");
    }
}
