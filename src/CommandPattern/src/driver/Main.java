package CommandPattern.src.driver;

import CommandPattern.src.command.OpenFileCommand;
import CommandPattern.src.invoker.FileInvoker;
import CommandPattern.src.receiver.FileSystemReceiver;
import CommandPattern.src.utils.FileSystemReceiverUtil;

public class Main {

    public static void main(String[] args) {

        FileSystemReceiverUtil fileSystemReceiverUtil = new FileSystemReceiverUtil();
        FileSystemReceiver fileSystemReceiver = fileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);

        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.executeCommand();
    }
}
