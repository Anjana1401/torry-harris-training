package com.torryharris.model;

public class A {
    private int a;
    public static int value;

    public A() {
    }

    public A(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getValue() {
        return value;
    }

    public static void setValue(int value) {
        A.value = value;
    }
    public void display(){
        System.out.println("A's display method");
    }

    public static void staticMethod(){
        System.out.println("A's static method");
    }
}
