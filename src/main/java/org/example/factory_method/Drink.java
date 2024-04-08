package org.example.factory_method;

public abstract class Drink {
    public abstract String getName();
    public void addIce(){
        System.out.println("Adding ice...");
    }
    public void addSugar(){
        System.out.println("Adding sugar...");
    }
}
