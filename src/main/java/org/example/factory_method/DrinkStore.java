package org.example.factory_method;

import org.example.factory_method.factory.DrinkFactory;

import java.util.Scanner;

public class DrinkStore {
    private DrinkFactory factory;

    public void setFactory(DrinkFactory factory) {
        this.factory = factory;
    }

    public Drink orderDrink() {
        Drink drink = factory.createDrink();
        drink.addIce();
        drink.addSugar();
        return drink;
    }
}
