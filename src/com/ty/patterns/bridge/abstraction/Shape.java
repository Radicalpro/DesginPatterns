package com.ty.patterns.bridge.abstraction;

import com.ty.patterns.bridge.implementor.Color;

public abstract class Shape {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}