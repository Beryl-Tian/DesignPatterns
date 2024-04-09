package org.example.builder;

public class Main {
    public static void main(String[] args) {
//        showBike(new MobikeBuilder());
//        showBike(new HelloBuilder());

        Bike bike = new Bike.BikeBuilder()
                .frame("Frame A")
                .seat("Seat B")
                .wheels("Wheels C")
                .brake("Brake D")
                .build();
        System.out.println(bike);
    }

//    public static void showBike(BikeBuilder builder) {
//        Director director = new Director(builder);
//        Bike bike = director.construct();
//        System.out.println(bike.getFrame());
//        System.out.println(bike.getSeat());
//    }
}