package com.ty.patterns.state.concretestate;

import com.ty.patterns.state.context.Room;
import com.ty.patterns.state.state.State;

/**
 * 预定状态房间只能退房
 *
 * @author tianyi
 * @date 2018/08/30
 */
public class BookedState implements State {
    private Room hotelManagement;

    public BookedState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("该房间已近给预定了...");
    }

    @Override
    public void checkInRoom() {
        System.out.println("入住成功...");
        //状态变成入住
        hotelManagement.setState(hotelManagement.getCheckInState());
    }

    @Override
    public void checkOutRoom() {
        //不需要做操作
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("退订成功,欢迎下次光临...");
        //变成空闲状态
        hotelManagement.setState(hotelManagement.getFreeTimeState());
    }

}