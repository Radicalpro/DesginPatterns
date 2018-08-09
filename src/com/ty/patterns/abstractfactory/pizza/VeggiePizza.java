package com.ty.patterns.abstractfactory.pizza;

import com.ty.patterns.abstractfactory.Pizza;
import com.ty.patterns.abstractfactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("Prepare " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();
    }
}

