package com.ty.patterns.visitor.concretevisitor;

import com.ty.patterns.visitor.concreteelement.MedicineA;
import com.ty.patterns.visitor.concreteelement.MedicineB;
import com.ty.patterns.visitor.vistor.Visitor;

/**
 * 具体访问者：药房工作者
 */
public class WorkerOfPharmacy extends Visitor {

    @Override
    public void visitor(MedicineA a) {
        System.out.println("药房工作者：" + name + "拿药 ：" + a.getName());
    }

    @Override
    public void visitor(MedicineB b) {
        System.out.println("药房工作者：" + name + "拿药 ：" + b.getName());
    }
}
