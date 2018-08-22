package com.ty.patterns.decorator.concretecomponent;

import com.ty.patterns.decorator.component.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
