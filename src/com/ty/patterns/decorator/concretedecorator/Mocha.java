package com.ty.patterns.decorator.concretedecorator;

import com.ty.patterns.decorator.component.Beverage;
import com.ty.patterns.decorator.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
