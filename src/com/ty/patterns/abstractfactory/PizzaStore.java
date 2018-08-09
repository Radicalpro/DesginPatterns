package com.ty.patterns.abstractfactory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 创建pizza的方法交给子类去实现
     *
     * @param type
     * @return Pizza
     */
    protected abstract Pizza createPizza(String type);
}
