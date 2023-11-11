package org.example.behavioral.strategy;

import org.example.behavioral.strategy.custom.Context;
import org.example.behavioral.strategy.custom.operation.AddOperation;
import org.example.behavioral.strategy.custom.operation.DivideOperation;
import org.example.behavioral.strategy.custom.operation.MultiplyOperation;
import org.example.behavioral.strategy.custom.operation.SubtractOperation;

public class Main {
    public static void main(String[] args) {

        Context context1 = new Context(new AddOperation());
        System.out.println("10 + 5 = " + context1.execute(10, 5));

        Context context2 = new Context(new SubtractOperation());
        System.out.println("10 - 5 = " + context2.execute(10, 5));

        Context context3 = new Context(new DivideOperation());
        System.out.println("10 / 5 = " + context3.execute(10, 5));

        Context context4 = new Context(new MultiplyOperation());
        System.out.println("10 * 5 = " + context4.execute(10, 5));

    }
}
