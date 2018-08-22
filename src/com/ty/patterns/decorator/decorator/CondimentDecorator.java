package com.ty.patterns.decorator.decorator;

import com.ty.patterns.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}
