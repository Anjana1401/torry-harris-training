package com.torryharris.model;

public class GenericsPrint<T> {
    private T obj;

    public GenericsPrint(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
    public static<T> void  GenericDisplay(T obj){

        System.out.println("Given value is: "+obj);

    }
}
