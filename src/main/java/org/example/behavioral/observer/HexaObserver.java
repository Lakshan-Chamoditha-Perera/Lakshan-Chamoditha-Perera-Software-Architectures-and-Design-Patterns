package org.example.behavioral.observer;

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    void update() {
        System.out.println("Hexa observer is updated : "+Integer.toHexString(subject.getState()));
    }
}
