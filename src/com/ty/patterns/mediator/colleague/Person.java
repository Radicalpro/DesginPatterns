package com.ty.patterns.mediator.colleague;

import com.ty.patterns.mediator.mediator.Mediator;

public abstract class Person {

    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

}