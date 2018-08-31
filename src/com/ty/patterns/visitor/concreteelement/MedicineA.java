package com.ty.patterns.visitor.concreteelement;

import com.ty.patterns.visitor.element.Medicine;
import com.ty.patterns.visitor.vistor.Visitor;

/**
 * 具体元素
 */
public class MedicineA extends Medicine {

    public MedicineA(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
