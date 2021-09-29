package com.torryharris.drivers;
import com.torryharris.model.Shape;
import com.torryharris.model.Triangle;
import com.torryharris.model.Rectangle;
public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape=new Triangle(10,20);
        shape.area();

        shape=new Rectangle(10,20);
shape.area();
    }
}
