package com.ty.patterns.flyweight.concreteflyweight;

import com.ty.patterns.flyweight.flyweight.Shape;

public class Circle extends Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("画了一个" + color + "的圆形");
    }
}
