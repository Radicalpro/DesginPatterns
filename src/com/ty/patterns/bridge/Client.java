package com.ty.patterns.bridge;

import com.ty.patterns.bridge.abstraction.Shape;
import com.ty.patterns.bridge.concreteimplementor.White;
import com.ty.patterns.bridge.implementor.Color;
import com.ty.patterns.bridge.refinedabstraction.Rectangle;
import com.ty.patterns.bridge.refinedabstraction.Square;

public class Client {
    public static void main(String[] args) {
        //白色
        Color white = new White();
        //正方形
        Shape square = new Square();
        //白色的正方形
        square.setColor(white);
        square.draw();

        //长方形
        Shape rectange = new Rectangle();
        rectange.setColor(white);
        rectange.draw();
    }
}
