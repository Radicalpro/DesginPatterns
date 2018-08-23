package com.ty.patterns.chainofresponsibility.concretehandler;

import com.ty.patterns.chainofresponsibility.LeaveNode;
import com.ty.patterns.chainofresponsibility.handler.Leader;

public class DepartmentHead extends Leader {

    public DepartmentHead(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveNode LeaveNode) {
        //小于7天系主任审批
        if(LeaveNode.getNumber() <= 7){
            System.out.println("系主任" + name + "审批" +LeaveNode.getPerson() + "同学的请假条,请假天数为" + LeaveNode.getNumber() + "天。");
        }
        else{     //否则传递给院长
            if(this.successor != null){
                this.successor.handleRequest(LeaveNode);
            }
        }
    }
}