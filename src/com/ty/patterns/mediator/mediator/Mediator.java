package com.ty.patterns.mediator.mediator;

import com.ty.patterns.mediator.colleague.Person;

public abstract class Mediator {

    //申明一个联络方法
    public abstract void constact(String message, Person person);

}
