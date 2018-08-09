package com.ty.patterns.factorymethod.pizza;

import com.ty.patterns.factorymethod.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sause = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Veggie");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the Pizza into square slices");
    }
}
