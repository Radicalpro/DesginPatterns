package com.ty.patterns.iterator.concreteiterator;

import com.ty.patterns.iterator.MenuItem;
import com.ty.patterns.iterator.iterator.Iterator;

public class FilmMenuIterator implements Iterator {

    private MenuItem[] menuItems;
    private int position = 0;

    public FilmMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position <= menuItems.length - 1 && menuItems[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

}