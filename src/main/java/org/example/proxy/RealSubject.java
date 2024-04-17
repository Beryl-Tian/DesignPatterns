package org.example.proxy;

public class RealSubject extends Subject{
    @Override
    public void request() {
        System.out.println("real request...");
    }
}
