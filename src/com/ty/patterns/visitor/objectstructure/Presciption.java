package com.ty.patterns.visitor.objectstructure;

import com.ty.patterns.visitor.element.Medicine;
import com.ty.patterns.visitor.vistor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 药单
 */
public class Presciption {

    List<Medicine> list = new ArrayList<Medicine>();

    public void accept(Visitor visitor) {
        Iterator<Medicine> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void addMedicine(Medicine medicine) {
        list.add(medicine);
    }

    public void removeMedicien(Medicine medicine) {
        list.remove(medicine);
    }

}
