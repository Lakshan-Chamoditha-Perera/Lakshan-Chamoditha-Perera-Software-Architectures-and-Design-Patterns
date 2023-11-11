package org.example.creational.facade.custom.impl;

import org.example.creational.facade.custom.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
