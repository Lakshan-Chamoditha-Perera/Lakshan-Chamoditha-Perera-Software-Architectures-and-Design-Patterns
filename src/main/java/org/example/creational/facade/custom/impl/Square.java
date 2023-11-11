package org.example.creational.facade.custom.impl;

import org.example.creational.facade.custom.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
