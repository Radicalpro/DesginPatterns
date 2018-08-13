package com.ty.patterns.adapter;

import com.ty.patterns.adapter.adaptee.Dog;
import com.ty.patterns.adapter.adapter.DogAdapter;
import com.ty.patterns.adapter.targer.Robot;

public class Client {
    public static void main(String[] args) {

        //首先我们需要一个机器人
        BioRobot robot = new BioRobot();

        //和一只狗
        Dog dog = new Dog();

        //将这只狗包装到机器人中，使其有点儿像机器人
        Robot dogRobot = new DogAdapter(dog);

        //然后是机器人叫和跑
        System.out.println("BioRob cry.....");
        dogRobot.cry();
        dogRobot.move();
    }
}
