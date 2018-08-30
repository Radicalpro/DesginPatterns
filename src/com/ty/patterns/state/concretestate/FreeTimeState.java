package com.ty.patterns.state.concretestate;

import com.ty.patterns.state.context.Room;
import com.ty.patterns.state.state.State;

/**
 * 空闲状态只能预订和入住
 *
 * @author tianyi
 * @date 2018/08/30
 */
public class FreeTimeState implements State {

    private Room hotelManagement;

    public FreeTimeState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("您已经成功预订了...");
        //状态变成已经预订
        hotelManagement.setState(hotelManagement.getBookedState());
    }

    @Override
    public void checkInRoom() {
        System.out.println("您已经成功入住了...");
        //状态变成已经入住
        hotelManagement.setState(hotelManagement.getCheckInState());
    }

    @Override
    public void checkOutRoom() {
        //不需要做操作
    }

    @Override
    public void unsubscribeRoom() {
        //不需要做操作
    }

}