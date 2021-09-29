package com.torryharris.drivers;

import com.torryharris.model.Bird;
import com.torryharris.model.Peacock;
import com.torryharris.model.Pegion;

public class BirdDemo {
    public static void main(String[] args) {
        Bird peacock=new Peacock();
        peacock.eat();
        peacock.fly();

        Bird pegion=new Pegion();
        pegion.eat();
        pegion.fly();
    }
}
