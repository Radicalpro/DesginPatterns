package com.ty.patterns.factorymethod.pizza;

import com.ty.patterns.factorymethod.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "Ny Style Sauce and Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sause = "Marinara Sauce";
        toppings.add("Crated Reggiano Pepperoni");
    }

}
