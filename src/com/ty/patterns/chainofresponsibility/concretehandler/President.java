package com.ty.patterns.chainofresponsibility.concretehandler;

import com.ty.patterns.chainofresponsibility.LeaveNode;
import com.ty.patterns.chainofresponsibility.handler.Leader;

public class President extends Leader {

    public President(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveNode LeaveNode) {
        //小于15天校长长审批
        if (LeaveNode.getNumber() <= 15) {
            System.out.println("校长" + name + "审批" + LeaveNode.getPerson() + "同学的请假条,请假天数为" + LeaveNode.getNumber() + "天。");
        } else {     //否则不允批准
            System.out.println("请假天天超过15天,不批准...");
        }
    }

}