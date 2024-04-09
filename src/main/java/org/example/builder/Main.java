package org.example.builder;

public class Main {
    public static void main(String[] args) {
        showBike(new MobikeBuilder());
        showBike(new HelloBuilder());
    }

    public static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}