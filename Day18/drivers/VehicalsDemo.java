package com.torryharris.drivers;

import com.torryharris.model.*;

public class VehicalsDemo {
    public static void main(String[] args) {
        Car swift=new Swift();
        swift.move();
        swift.changeGears();

        Boat titanic=new Titanic();
        titanic.move();
        titanic.floats();

        Aeroplain airIndia=new AirIndia();
        airIndia.move();
        airIndia.fly();
    }

}
