package com.ty.patterns.visitor.concretevisitor;

import com.ty.patterns.visitor.concreteelement.MedicineA;
import com.ty.patterns.visitor.concreteelement.MedicineB;
import com.ty.patterns.visitor.vistor.Visitor;

/**
 * 具体访问者：划价员
 */
public class Charger extends Visitor {

    @Override
    public void visitor(MedicineA a) {
        System.out.println("划价员：" + name + "给药" + a.getName() + "划价:" + a.getPrice());
    }

    @Override
    public void visitor(MedicineB b) {
        System.out.println("划价员：" + name + "给药" + b.getName() + "划价:" + b.getPrice());
    }

}
