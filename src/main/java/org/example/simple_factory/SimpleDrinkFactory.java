package org.example.simple_factory;

public class SimpleDrinkFactory {
    public Drink createDrink(String drinkType) {
        Drink drink = null;
        if ("ThiaTea".equals(drinkType)) {
            drink = new ThaiTea();
        } else if ("BubbleTea".equals(drinkType)) {
            drink = new BubbleTea();
        } else throw new RuntimeException("Type is not found...");
        return drink;
    }
}
