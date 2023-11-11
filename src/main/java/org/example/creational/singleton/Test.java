package org.example.creational.singleton;

public class Test {
    private static Test instance;

    private Test() {
    }

    public static Test getInstance() {
        return (instance == null) ? instance = new Test() : instance;
    }

    public void print() {
        System.out.println("Hello I'm Singleton");
    }
}
