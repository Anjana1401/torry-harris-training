package com.torryharris.driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Anjana");
        list.add("Sanjana");
        list.add("Sinjana");
        list.add("Ranjana");
        for (String str : list) {
            System.out.println(str);
        }
        list.add(2, "Siya");
        for (String str : list) {
            System.out.println(str);
        }


        System.out.println(list);
    }
}