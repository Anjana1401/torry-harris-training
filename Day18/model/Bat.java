package com.torryharris.model;

public class Bat implements Mamal,Bird{
    @Override
    public void fly() {
        System.out.println("Bat is flying.");
    }

    @Override
    public void feed() {
        System.out.println("Bat is feeing its cild");
    }

    @Override
    public void eat() {
        System.out.println("Bat is eating Insects.");
    }
}
