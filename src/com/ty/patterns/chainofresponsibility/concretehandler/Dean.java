package com.ty.patterns.chainofresponsibility.concretehandler;

import com.ty.patterns.chainofresponsibility.LeaveNode;
import com.ty.patterns.chainofresponsibility.handler.Leader;

public class Dean extends Leader {

    public Dean(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveNode LeaveNode) {
        //小于10天院长审批President
        if (LeaveNode.getNumber() <= 10) {
            System.out.println("院长" + name + "审批" + LeaveNode.getPerson() + "同学的请假条,请假天数为" + LeaveNode.getNumber() + "天。");
        } else {     //否则传递给校长
            if (this.successor != null) {
                this.successor.handleRequest(LeaveNode);
            }
        }
    }

}