package com.torryharris.model;

public class AirIndia implements Aeroplain{
    @Override
    public void fly() {
        System.out.println("Aeroplains can fly to any places.");
    }

    @Override
    public void move() {
        System.out.println("Aeroplains can Move.");
    }
}
