package com.ty.patterns.abstractfactory.store;

import com.ty.patterns.abstractfactory.factory.NYPizzaIngredientFactory;
import com.ty.patterns.abstractfactory.Pizza;
import com.ty.patterns.abstractfactory.PizzaIngredientFactory;
import com.ty.patterns.abstractfactory.PizzaStore;
import com.ty.patterns.abstractfactory.pizza.CheesePizza;
import com.ty.patterns.abstractfactory.pizza.ClamPizza;
import com.ty.patterns.abstractfactory.pizza.PepperoniPizza;
import com.ty.patterns.abstractfactory.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        //使用纽约的原料工厂
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
