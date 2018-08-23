package com.ty.patterns.chainofresponsibility;

import com.ty.patterns.chainofresponsibility.concretehandler.Dean;
import com.ty.patterns.chainofresponsibility.concretehandler.DepartmentHead;
import com.ty.patterns.chainofresponsibility.concretehandler.Instructor;
import com.ty.patterns.chainofresponsibility.concretehandler.President;
import com.ty.patterns.chainofresponsibility.handler.Leader;

public class Client {
    public static void main(String[] args) {
        //辅导员
        Leader instructor = new Instructor("陈毅");
        //系主任
        Leader departmentHead = new DepartmentHead("王明");
        //院长
        Leader dean = new Dean("张强");
        //校长
        Leader president = new President("王晗");

        //辅导员的后续者是系主任
        instructor.setSuccessor(departmentHead);
        //系主任的后续者是院长
        departmentHead.setSuccessor(dean);
        //院长的后续者是校长
        dean.setSuccessor(president);

        //请假3天的请假条
        LeaveNode leaveNode1 = new LeaveNode("张三", 3);
        instructor.handleRequest(leaveNode1);

        //请假9天的请假条
        LeaveNode leaveNode2 = new LeaveNode("李四", 9);
        instructor.handleRequest(leaveNode2);

        //请假15天的请假条
        LeaveNode leaveNode3 = new LeaveNode("王五", 15);
        instructor.handleRequest(leaveNode3);

        //请假20天的请假条
        LeaveNode leaveNode4 = new LeaveNode("赵六", 20);
        instructor.handleRequest(leaveNode4);
    }
}
