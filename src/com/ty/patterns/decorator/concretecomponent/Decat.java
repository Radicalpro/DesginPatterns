package com.ty.patterns.decorator.concretecomponent;

import com.ty.patterns.decorator.component.Beverage;

public class Decat extends Beverage {

    public Decat() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
