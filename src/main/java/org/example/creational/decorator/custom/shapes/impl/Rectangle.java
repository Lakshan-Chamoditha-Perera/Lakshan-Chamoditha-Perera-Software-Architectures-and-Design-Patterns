package org.example.creational.decorator.custom.shapes.impl;

import org.example.creational.decorator.custom.shapes.Shape;

public class Rectangle  implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
