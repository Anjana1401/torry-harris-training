package com.torryharris.driver;

import com.torryharris.comparator.PersonNameComparator;
import com.torryharris.model.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person(123445625727L, "Anjana", "Karnataka", "IT Employee",50000);
        Person p2 = new Person(658676678933L, "Gagana", "TamilNadu", "Teaching",60000);
        Person p3 = new Person(897687698776L, "Chaithra", "AndraPradesh", "IT Employee",70000);
        Person p4 = new Person(865869808974l, "JayaChandra", "Karnataka", "IT Employee",800000);
        Person p5 = new Person(136678678621l, "Anitha", "Andhra Pradesh", "IT Employee",900000);

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(p1);
        personArrayList.add(p2);
        personArrayList.add(p3);
        personArrayList.add(p4);
        personArrayList.add(p5);
        System.out.println("*******Before sorting By Aadhar number*****");
        Iterator<Person> personIterable = personArrayList.iterator();
        while (personIterable.hasNext()) {
            System.out.println(personIterable.next());
        }
        personArrayList.sort(null);
        System.out.println("********After Sorting*******");
        personIterable = personArrayList.iterator();
        while (personIterable.hasNext()) {
            System.out.println(personIterable.next());
        }
        personArrayList.sort(new PersonNameComparator());
        System.out.println("********After Sorting By name*******");
        personIterable = personArrayList.iterator();
        while (personIterable.hasNext()) {
            System.out.println(personIterable.next());
        }
    }
}