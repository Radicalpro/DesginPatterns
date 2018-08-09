package com.ty.patterns.factorymethod;

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
     */
    protected abstract Pizza createPizza(String type);

}
