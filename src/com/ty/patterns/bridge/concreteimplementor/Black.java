package com.ty.patterns.bridge.concreteimplementor;

import com.ty.patterns.bridge.implementor.Color;

public class Black implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
