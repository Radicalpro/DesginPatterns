package com.ty.patterns.chainofresponsibility.concretehandler;

import com.ty.patterns.chainofresponsibility.LeaveNode;
import com.ty.patterns.chainofresponsibility.handler.Leader;

public class Instructor extends Leader {

    public Instructor(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveNode LeaveNode) {
        //小于3天辅导员审批
        if (LeaveNode.getNumber() <= 3) {
            System.out.println("辅导员" + name + "审批" + LeaveNode.getPerson() + "同学的请假条,请假天数为" + LeaveNode.getNumber() + "天。");
        } else {     //否则传递给系主任
            if (this.successor != null) {
                this.successor.handleRequest(LeaveNode);
            }
        }
    }

}