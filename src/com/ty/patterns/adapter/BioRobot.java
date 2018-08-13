package com.ty.patterns.adapter;

import com.ty.patterns.adapter.targer.Robot;

public class BioRobot implements Robot {

    @Override
    public void cry() {
        System.out.println("仿生机器人叫.....");
    }

    @Override
    public void move() {
        System.out.println("仿生机器人慢慢移动....");
    }

}
