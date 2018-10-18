package CommandPattern.src.command;

import CommandPattern.src.receiver.FileSystemReceiver;

public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}
