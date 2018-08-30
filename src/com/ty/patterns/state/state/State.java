package com.ty.patterns.state.state;

public interface State {
    /**
     * @return void
     * @desc 预订房间
     */
    void bookRoom();

    /**
     * @return void
     * @desc 退订房间
     */
    void unsubscribeRoom();

    /**
     * @return void
     * @desc 入住
     */
    void checkInRoom();

    /**
     * @return void
     * @desc 退房
     */
    void checkOutRoom();
}
