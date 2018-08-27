package com.ty.patterns.iterator.concreteaggregate;

import com.ty.patterns.iterator.MenuItem;
import com.ty.patterns.iterator.aggregate.TelevisionMenu;
import com.ty.patterns.iterator.concreteiterator.TVChanneMenuIterator;
import com.ty.patterns.iterator.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class TVChanneMenu implements TelevisionMenu {
    private List<MenuItem> menuItems;

    /**
     * 构造函数完成初始化
     */
    public TVChanneMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem(1, "CCTV-1", "This is CCTV-1");
        addItem(2, "CCTV-2", "This is CCTV-2");
        addItem(3, "CCTV-3", "This is CCTV-3");
        addItem(4, "CCTV-4", "This is CCTV-4");
        addItem(5, "CCTV-5", "This is CCTV-5");
    }

    /**
     * @param channe      频道
     * @param name        名称
     * @param description 描述
     * @return void
     * @desc 将电视频道节目添加菜单集合中
     */
    @Override
    public void addItem(int channe, String name, String description) {
        MenuItem tvMenuItem = new MenuItem(channe, name, description);
        menuItems.add(tvMenuItem);
    }

    @Override
    public Iterator createIterator() {
        return new TVChanneMenuIterator(menuItems);
    }

}