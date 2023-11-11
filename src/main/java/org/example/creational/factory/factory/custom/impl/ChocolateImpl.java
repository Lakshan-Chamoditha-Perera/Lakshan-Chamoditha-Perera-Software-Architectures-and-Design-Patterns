package org.example.creational.factory.factory.custom.impl;

import org.example.creational.factory.factory.custom.Chocolate;

public class ChocolateImpl implements Chocolate {
    public ChocolateImpl() {
        System.out.println("Chocolate ice-cream created");
    }
    public void print() {
        System.out.println("Chocolate");
    }
}
