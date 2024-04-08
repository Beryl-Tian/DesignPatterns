package org.example.factory_method.factory;

import org.example.factory_method.Drink;
import org.example.factory_method.ThaiTea;

public class ThiaTeaFactory implements DrinkFactory {
    @Override
    public Drink createDrink() {
        return new ThaiTea();
    }
}
