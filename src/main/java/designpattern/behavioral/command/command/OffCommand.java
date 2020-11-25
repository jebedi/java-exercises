package designpattern.behavioral.command.command;

import designpattern.behavioral.command.electronics.Electronics;

import java.util.List;

public class OffCommand implements Command {
    List<Electronics> electronics;

    public OffCommand(List<Electronics> electronics) {
        this.electronics = electronics;
    }

    @Override
    public void execute() {
        electronics.forEach(Electronics::off);
    }
}
