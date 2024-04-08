package org.example.factory_method;


import org.example.factory_method.factory.BubbleTeaFactory;
import org.example.factory_method.factory.DrinkFactory;

public class Main {
    public static void main(String[] args) {
        // create store
        DrinkStore store = new DrinkStore();
        // create drink object
        DrinkFactory factory = new BubbleTeaFactory();
        store.setFactory(factory);

        // order drink
        Drink drink = store.orderDrink();

        System.out.println(drink.getName());
    }

}