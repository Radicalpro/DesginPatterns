package com.ty.patterns.decorator.concretedecorator;

import com.ty.patterns.decorator.component.Beverage;
import com.ty.patterns.decorator.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}