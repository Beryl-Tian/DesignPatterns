package org.example.simple_factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        order();
    }

    public static Drink order() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please order your drinks...");
        String type = myScanner.nextLine();
        DrinkStore drinkStore = new DrinkStore();
        return drinkStore.orderDrink(type);
    }


}