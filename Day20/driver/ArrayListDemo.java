package com.torryharris.driver;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integerList=new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        System.out.println(integerList);

        integerList.add(3,100);
        System.out.println(integerList);

        integerList.add(40);
        integerList.add(50);
        integerList.add(60);

        System.out.println(integerList);
    }
}
