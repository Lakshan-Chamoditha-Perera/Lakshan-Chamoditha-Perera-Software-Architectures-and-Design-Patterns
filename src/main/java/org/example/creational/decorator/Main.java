package org.example.creational.decorator;

import org.example.creational.decorator.custom.shapes.impl.Circle;
import org.example.creational.decorator.custom.shapes.impl.Rectangle;
import org.example.creational.decorator.custom.shapes.Shape;
import org.example.creational.decorator.custom.decors.RedShapeDecorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        System.out.println("Circle with normal border");
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }
}
