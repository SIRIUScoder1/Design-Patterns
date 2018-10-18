package CommandPattern.src.receiver;

public class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in mac os");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in mac os");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in mac os");
    }
}
