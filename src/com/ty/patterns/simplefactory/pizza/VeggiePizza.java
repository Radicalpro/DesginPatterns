package com.ty.patterns.simplefactory.pizza;

import com.ty.patterns.simplefactory.Pizza;

public class VeggiePizza extends Pizza {
    @Override
    public void bake() {
        System.out.println("bake VeggiePizza ...");
    }

    @Override
    public void box() {
        System.out.println("box VeggiePizza ...");
    }

    @Override
    public void cut() {
        System.out.println("cut VeggiePizza ...");
    }

    @Override
    public void prepare() {
        System.out.println("prepare VeggiePizza ...");
    }
}

