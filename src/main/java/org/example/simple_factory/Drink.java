package org.example.simple_factory;

public abstract class Drink {
    public abstract String getName();
    public void addIce(){
        System.out.println("Adding ice...");
    }
    public void addSugar(){
        System.out.println("Adding sugar...");
    }
}
