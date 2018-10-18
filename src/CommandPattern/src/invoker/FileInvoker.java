package CommandPattern.src.invoker;

import CommandPattern.src.command.Command;

public class FileInvoker {

    public Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.execute();
    }
}
