package com.ty.patterns.command.concretecommand;

import com.ty.patterns.command.command.Command;
import com.ty.patterns.command.receiver.Television;

public class OpenTvCommand implements Command {

    private Television tv;

    public OpenTvCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.open();
    }
}
