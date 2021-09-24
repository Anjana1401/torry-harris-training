package com.torryharris.model;

public class HatchBack extends Car {
    String steeringTyre;

    public HatchBack() {
    }

    public HatchBack(String steeringTyre) {
        this.steeringTyre = steeringTyre;
    }

    public HatchBack(String name, String fuelType, int engineCapacity, float power, int noOfGears, Tyre tyre, MusicSystem musicSystem, String steeringTyre) {
        super(name, fuelType, engineCapacity, power, noOfGears, tyre, musicSystem);
        this.steeringTyre = steeringTyre;
    }

    public void displayHatchBackFeatures(){
        displayFeatures();
        System.out.println("steering Type: "+steeringTyre);
        System.out.println();
    }

    public String getSteeringTyre() {
        return steeringTyre;
    }

    public void setSteeringTyre(String steeringTyre) {
        this.steeringTyre = steeringTyre;
    }
}
