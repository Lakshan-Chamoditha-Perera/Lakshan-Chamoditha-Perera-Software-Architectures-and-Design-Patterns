package org.example.creational.factory.factory.custom.impl;

import org.example.creational.factory.factory.custom.Vanilla;

public class VanillaImpl implements Vanilla {
    public VanillaImpl() {
        System.out.println("Vanilla ice-cream created");
    }

    public void print() {
        System.out.println("Vanilla");
    }
}
