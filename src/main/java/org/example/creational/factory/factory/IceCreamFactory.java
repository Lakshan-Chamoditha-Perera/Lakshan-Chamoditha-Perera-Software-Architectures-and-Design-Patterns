package org.example.creational.factory.factory;

import org.example.creational.factory.factory.custom.impl.ChocolateImpl;
import org.example.creational.factory.factory.custom.impl.VanillaImpl;
import org.example.creational.factory.type.IceCreamType;


public class IceCreamFactory {
    private static IceCreamFactory INSTANCE;

    private IceCreamFactory() {
    }

    public static IceCreamFactory getInstance() {
        return (INSTANCE == null) ? INSTANCE = new IceCreamFactory() : INSTANCE;
    }

    public <T extends IceCream> T createIceCream(IceCreamType iceCreamType) {
        return switch (iceCreamType) {
            case CHOCOLATE -> (T) new ChocolateImpl();
            case VANILLA -> (T) new VanillaImpl();
            case STRAWBERRY -> throw new UnsupportedOperationException("Not implemented yet");
            default -> throw new IllegalArgumentException("No such ice-cream");};
    }
}
