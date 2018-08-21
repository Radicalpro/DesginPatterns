package com.ty.patterns.combination.composite;

import com.ty.patterns.combination.component.File;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {

    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }

    /**
     * 浏览文件夹中的文件
     */
    @Override
    public void display() {
        for (File file : files) {
            file.display();
        }
    }

    /**
     * 向文件夹中添加文件
     *
     * @param file
     */
    public void add(File file) {
        files.add(file);
    }

    /**
     * 从文件夹中删除文件
     *
     * @param file
     */
    public void remove(File file) {
        files.remove(file);
    }
}