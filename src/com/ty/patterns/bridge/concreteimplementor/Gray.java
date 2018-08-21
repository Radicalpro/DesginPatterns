package com.ty.patterns.bridge.concreteimplementor;

import com.ty.patterns.bridge.implementor.Color;

public class Gray implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("灰色的" + shape);
    }
}