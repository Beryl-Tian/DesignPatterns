package org.example.simple_factory;

public class DrinkStore {
    public Drink orderDrink(String type)
    {
        SimpleDrinkFactory factory = new SimpleDrinkFactory();
        Drink drink = factory.createDrink(type);

        drink.addIce();
        drink.addSugar();
        return drink;
    }
}
