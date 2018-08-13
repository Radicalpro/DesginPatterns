package com.ty.patterns.adapter.adapter;

import com.ty.patterns.adapter.targer.Robot;
import com.ty.patterns.adapter.adaptee.Dog;

public class DogAdapter implements Robot {

    private Dog dog;

    /**
     * 取得要适配的对象的引用
     */
    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    /**
     * 实现接口中的方法，只需要在相应的方法间进行转换即可完成。
     */
    @Override
    public void cry() {
        System.out.println("机器人模拟狗叫...");
        dog.wang();
    }

    @Override
    public void move() {
        System.out.println("机器人模拟狗跑...");
        dog.run();
    }

}
