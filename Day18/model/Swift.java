package com.torryharris.model;

public class Swift implements Car{
    @Override
    public void changeGears() {
        System.out.println("Cars can change the Gears.");
    }

    @Override
    public void move() {
        System.out.println("Cars can Move.");
    }
}
