package com.ty.patterns.simplefactory;

public class PizzaStore {
    /**
     * SimplePizzaFactory的引用
     */
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        //使用工厂对象的创建方法，而不是直接new。这里不再使用具体实例化
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
