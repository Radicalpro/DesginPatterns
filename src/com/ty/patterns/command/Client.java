package com.ty.patterns.command;

import com.ty.patterns.command.command.Command;
import com.ty.patterns.command.concretecommand.ChangeChannelCommand;
import com.ty.patterns.command.concretecommand.CloseTvCommand;
import com.ty.patterns.command.concretecommand.OpenTvCommand;
import com.ty.patterns.command.invoker.Controller;

public class Client {

    public static void main(String[] args) {
        Command openCommand, closeCommand, changeCommand;

        openCommand = new OpenTvCommand();
        closeCommand = new CloseTvCommand();
        changeCommand = new ChangeChannelCommand();

        Controller control = new Controller(openCommand, closeCommand, changeCommand);

        control.open();           //打开电视机
        control.change();         //换频道
        control.close();          //关闭电视机
    }

}
