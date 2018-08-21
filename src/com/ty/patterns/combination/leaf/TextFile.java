package com.ty.patterns.combination.leaf;

import com.ty.patterns.combination.component.File;

public class TextFile extends File {

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是文本文件，文件名：" + super.getName());
    }

}
