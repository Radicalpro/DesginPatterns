package com.ty.patterns.command.concretecommand;

import com.ty.patterns.command.command.Command;
import com.ty.patterns.command.receiver.Television;

public class ChangeChannelCommand implements Command {

    private Television tv;

    public ChangeChannelCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }

}
