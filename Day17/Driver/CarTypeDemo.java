package com.torryharris.driver;

import com.torryharris.model.HatchBack;
import com.torryharris.model.MusicSystem;
import com.torryharris.model.SUV;
import com.torryharris.model.Tyre;

public class CarTypeDemo {
    public static void main(String[] args) {
        Tyre mrf=new Tyre("mrf",17);
        MusicSystem harman=new MusicSystem("harman",4,true);


        SUV nexon=new SUV("Nexon","Deesel",1500,115.6f,6,
                mrf,harman,"sports",true);

        nexon.accelerate();
        nexon.setDriveMode("Eco");
        nexon.accelerate();

    }
}
