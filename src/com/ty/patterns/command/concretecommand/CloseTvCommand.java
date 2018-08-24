package com.ty.patterns.command.concretecommand;

import com.ty.patterns.command.command.Command;
import com.ty.patterns.command.receiver.Television;

public class CloseTvCommand implements Command {

    private Television tv;

    public CloseTvCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.close();
    }
}
