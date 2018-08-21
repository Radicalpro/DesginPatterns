package com.ty.patterns.bridge.refinedabstraction;

import com.ty.patterns.bridge.abstraction.Shape;

public class Rectangle extends Shape {

    @Override
    public void draw() {
        color.bepaint("长方形");
    }

}