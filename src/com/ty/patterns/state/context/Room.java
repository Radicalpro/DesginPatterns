package com.ty.patterns.state.context;

import com.ty.patterns.state.concretestate.BookedState;
import com.ty.patterns.state.concretestate.CheckInState;
import com.ty.patterns.state.concretestate.FreeTimeState;
import com.ty.patterns.state.state.State;

public class Room {
    /*
     * 房间的三个状态
     */
    //空闲状态
    private State freeTimeState;
    //入住状态
    private State checkInState;
    //预订状态
    private State bookedState;

    private State state;

    public Room() {
        freeTimeState = new FreeTimeState(this);
        checkInState = new CheckInState(this);
        bookedState = new BookedState(this);
        //初始状态为空闲
        state = freeTimeState;
    }

    /**
     * @return void
     * @desc 预订房间
     */
    public void bookRoom() {
        state.bookRoom();
    }

    /**
     * @return void
     * @desc 退订房间
     */
    public void unsubscribeRoom() {
        state.unsubscribeRoom();
    }

    /**
     * @return void
     * @desc 入住
     */
    public void checkInRoom() {
        state.checkInRoom();
    }

    /**
     * @return void
     * @desc 退房
     */
    public void checkOutRoom() {
        state.checkOutRoom();
    }

    @Override
    public String toString() {
        return "该房间的状态是:" + getState().getClass().getName();
    }

    /**
     * getter和setter方法
     */
    public State getFreeTimeState() {
        return freeTimeState;
    }

    public void setFreeTimeState(State freeTimeState) {
        this.freeTimeState = freeTimeState;
    }

    public State getCheckInState() {
        return checkInState;
    }

    public void setCheckInState(State checkInState) {
        this.checkInState = checkInState;
    }

    public State getBookedState() {
        return bookedState;
    }

    public void setBookedState(State bookedState) {
        this.bookedState = bookedState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
