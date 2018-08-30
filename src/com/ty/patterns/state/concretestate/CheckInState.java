package com.ty.patterns.state.concretestate;

import com.ty.patterns.state.context.Room;
import com.ty.patterns.state.state.State;

/**
 * 入住可以退房
 *
 * @author tianyi
 * @date 2018/08/30
 */
public class CheckInState implements State {
    private Room hotelManagement;

    public CheckInState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("该房间已经入住了...");
    }

    @Override
    public void checkInRoom() {
        System.out.println("该房间已经入住了...");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("退房成功....");
        //状态变成空闲
        hotelManagement.setState(hotelManagement.getFreeTimeState());
    }

    @Override
    public void unsubscribeRoom() {
        //不需要做操作
    }

}