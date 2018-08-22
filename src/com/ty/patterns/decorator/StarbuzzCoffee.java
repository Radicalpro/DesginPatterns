package com.ty.patterns.decorator;

import com.ty.patterns.decorator.component.Beverage;
import com.ty.patterns.decorator.concretecomponent.DarkRoast;
import com.ty.patterns.decorator.concretecomponent.Espresso;
import com.ty.patterns.decorator.concretedecorator.Milk;
import com.ty.patterns.decorator.concretedecorator.Mocha;
import com.ty.patterns.decorator.concretedecorator.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
