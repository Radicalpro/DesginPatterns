package com.ty.patterns.decorator.concretecomponent;

import com.ty.patterns.decorator.component.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}