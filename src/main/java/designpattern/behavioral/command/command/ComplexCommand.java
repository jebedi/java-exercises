package designpattern.behavioral.command.command;

import java.util.List;

public class ComplexCommand implements Command {
    List<Command> commandList;

    public ComplexCommand(List<Command> commandList) {
        this.commandList = commandList;
    }

    @Override
    public void execute() {
        commandList.forEach(Command::execute);
    }
}
