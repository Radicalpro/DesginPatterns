package com.ty.patterns.combination.leaf;

import com.ty.patterns.combination.component.File;

public class VideoFile extends File {

    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是影像文件，文件名：" + super.getName());
    }

}