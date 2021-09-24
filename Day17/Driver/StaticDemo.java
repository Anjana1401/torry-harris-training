package com.torryharris.driver;

public class StaticDemo {
    private int a;
    private static int b;

    static{
        b=100;
    }
    static{
        b=200;
    }

    public static void main(String[] args) {
     b=20;
        StaticDemo sd=new StaticDemo();
        sd.display();
    }

    public void display(){
        a=100;
        b=200;
        System.out.println(a);
        System.out.println(b);
    }
}
