package com.ty.patterns.command.invoker;

import com.ty.patterns.command.command.Command;

public class Controller {
    private Command openTVCommand;
    private Command closeTVCommand;
    private Command changeChannelCommand;

    public Controller(Command openTvCommand, Command closeTvCommand, Command changeChannelCommand) {
        this.openTVCommand = openTvCommand;
        this.closeTVCommand = closeTvCommand;
        this.changeChannelCommand = changeChannelCommand;
    }

    /**
     * 打开电视剧
     */
    public void open() {
        openTVCommand.execute();
    }

    /**
     * 关闭电视机
     */
    public void close() {
        closeTVCommand.execute();
    }

    /**
     * 换频道
     */
    public void change() {
        changeChannelCommand.execute();
    }
}
