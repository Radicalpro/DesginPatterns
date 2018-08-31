package com.ty.patterns.visitor.vistor;

import com.ty.patterns.visitor.concreteelement.MedicineA;
import com.ty.patterns.visitor.concreteelement.MedicineB;

/**
 * 抽象访问者
 */
public abstract class Visitor {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }


    public abstract void visitor(MedicineA a);

    public abstract void visitor(MedicineB b);
}
