package com.ty.patterns.iterator.aggregate;

import com.ty.patterns.iterator.iterator.Iterator;

public interface TelevisionMenu {

    void addItem(int channe, String name, String description);

    Iterator createIterator();
}
