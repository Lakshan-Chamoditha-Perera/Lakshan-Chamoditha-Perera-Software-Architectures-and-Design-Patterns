package org.example.creational.factory;

import org.example.creational.factory.factory.IceCream;
import org.example.creational.factory.factory.IceCreamFactory;
import org.example.creational.factory.type.IceCreamType;

public class Main {
    public static void main(String[] args) {
        IceCreamFactory factory =  IceCreamFactory.getInstance();
        IceCream iceCream = factory.createIceCream(IceCreamType.CHOCOLATE);
        iceCream.print();

        iceCream = factory.createIceCream(IceCreamType.VANILLA);
        iceCream.print();

        try{
            iceCream = factory.createIceCream(IceCreamType.STRAWBERRY);
            iceCream.print();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
