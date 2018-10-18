package CommandPattern.src.command;

import CommandPattern.src.receiver.FileSystemReceiver;

public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}
