package org.example.behavioral.strategy.custom.operation;

import org.example.behavioral.strategy.custom.Strategy;

public class MultiplyOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
