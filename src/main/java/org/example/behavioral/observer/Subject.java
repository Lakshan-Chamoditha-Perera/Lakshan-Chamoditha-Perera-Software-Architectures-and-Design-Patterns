package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject extends Observer {
    int state;

    public int getState() {
        return state;
    }

    List<Observer> observers=new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    void notifyObservers(){
        observers.forEach(Observer::update);
    }
    @Override
    void update() {
        System.out.println("Subject is updated");
    }

    void attach(Observer observer){
        observers.add(observer);
    }
}
