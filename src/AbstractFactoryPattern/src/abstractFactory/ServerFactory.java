package AbstractFactoryPattern.src.abstractFactory;

import AbstractFactoryPattern.src.computer.Computer;
import AbstractFactoryPattern.src.computer.Server;

public class ServerFactory implements ComputerAbstractFactory {

    private String RAM;
    private String HDD;
    private String CPU;

    public ServerFactory(final String RAM, final String HDD, final String CPU) {

        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }


    @Override
    public Computer createComputer() {
        return new Server(this.RAM, this.HDD, this.CPU);
    }
}
