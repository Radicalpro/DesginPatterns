package com.ty.patterns.bridge.concreteimplementor;

import com.ty.patterns.bridge.implementor.Color;

public class White implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }

}