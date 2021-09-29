package com.torryharris.drivers;

import com.torryharris.model.Bat;
import com.torryharris.model.Cow;
import com.torryharris.model.Mamal;
import com.torryharris.model.Tiger;

public class MamalDemo {
    public static void main(String[] args) {
        Mamal tiger=new Tiger();
        tiger.feed();
        tiger.eat();

        Mamal cow=new Cow();
        cow.feed();
        cow.eat();

        Bat bat=new Bat();
        bat.feed();
        bat.eat();
        bat.fly();
    }
}
