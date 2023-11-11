package org.example.behavioral.observer;

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    void update() {
        System.out.println("Octal observer is updated : "+Integer.toOctalString(subject.getState()));
    }
}
