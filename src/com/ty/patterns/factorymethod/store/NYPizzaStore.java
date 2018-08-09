package com.ty.patterns.factorymethod.store;

import com.ty.patterns.factorymethod.Pizza;
import com.ty.patterns.factorymethod.PizzaStore;
import com.ty.patterns.factorymethod.pizza.NYStyleCheesePizza;
import com.ty.patterns.factorymethod.pizza.NYStyleClamPizza;
import com.ty.patterns.factorymethod.pizza.NYStylePepperoniPizza;
import com.ty.patterns.factorymethod.pizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        if ("cheese".equals(item)) {
            pizza = new NYStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            pizza = new NYStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            pizza = new NYStyleClamPizza();
        } else if ("pepperoni".equals(item)) {
            pizza = new NYStylePepperoniPizza();
        }

        return pizza;
    }
}
