package com.ty.patterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    /**
     * 名称
     */
    protected String name;
    /**
     * 面团
     */
    protected String dough;
    /**
     * 酱料
     */
    protected String sause;
    /**
     * 佐料
     */
    protected List<String> toppings = new ArrayList<>();


    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough" + dough);
        System.out.println("Adding sause" + sause);
        System.out.println("Adding toppings");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
