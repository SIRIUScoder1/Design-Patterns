package CommandPattern.src.utils;

import CommandPattern.src.receiver.FileSystemReceiver;
import CommandPattern.src.receiver.UnixFileSystemReceiver;
import CommandPattern.src.receiver.WindowsFileSystemReceiver;

public class FileSystemReceiverUtil {

    public FileSystemReceiver getUnderlyingFileSystem() {

        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is : " + osName);

        if(osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
