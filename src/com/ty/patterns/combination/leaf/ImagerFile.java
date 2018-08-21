package com.ty.patterns.combination.leaf;

import com.ty.patterns.combination.component.File;

public class ImagerFile extends File {

    public ImagerFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是图像文件，文件名：" + super.getName());
    }

}