package org.example.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Test test = Test.getInstance();
        test.print();
    }
}
