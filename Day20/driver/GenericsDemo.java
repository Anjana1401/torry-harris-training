package com.torryharris.driver;

import com.torryharris.model.GenericsPrint;

public class GenericsDemo {
    public static void main(String[] args) {
        GenericsPrint<Integer> iprint=new GenericsPrint<>(10);
        System.out.println(iprint.getObj());

        GenericsPrint<String> strprint=new GenericsPrint<>("Demo");
        System.out.println(strprint.getObj());

        GenericsPrint<Float> fprint=new GenericsPrint<>(3.5f);
        System.out.println(fprint.getObj());

        GenericsPrint.GenericDisplay(10);
        GenericsPrint.GenericDisplay("demo");
        GenericsPrint.GenericDisplay(2000);

        }
    }


