package com.ty.patterns.bridge.refinedabstraction;

import com.ty.patterns.bridge.abstraction.Shape;

public class Square extends Shape {

    @Override
    public void draw() {
        color.bepaint("正方形");
    }

}