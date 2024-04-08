package org.example.factory_method.factory;

import org.example.factory_method.BubbleTea;
import org.example.factory_method.Drink;


public class BubbleTeaFactory implements DrinkFactory {
    @Override
    public Drink createDrink() {
        return new BubbleTea();
    }
}
