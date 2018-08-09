package com.ty.patterns.factorymethod.store;

import com.ty.patterns.factorymethod.Pizza;
import com.ty.patterns.factorymethod.PizzaStore;
import com.ty.patterns.factorymethod.pizza.ChicagoStyleCheesePizza;
import com.ty.patterns.factorymethod.pizza.ChicagoStyleClamPizza;
import com.ty.patterns.factorymethod.pizza.ChicagoStylePepperoniPizza;
import com.ty.patterns.factorymethod.pizza.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ChicagoStyleClamPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if ("veggie".equals(type)) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
