package com.ty.patterns.adapter.adapter;

import com.ty.patterns.adapter.targer.Robot;
import com.ty.patterns.adapter.adaptee.Bird;

public class BirdAdapter implements Robot {

    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void cry() {
        bird.jiji();
    }

    @Override
    public void move() {
        bird.fly();
    }
}
