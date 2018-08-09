package com.ty.patterns.abstractfactory;

import com.ty.patterns.abstractfactory.ingredientabstract.*;

public interface PizzaIngredientFactory {

    /**
     * 在接口中，每个原料都有一个对应的方法创建该原料
     */
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
