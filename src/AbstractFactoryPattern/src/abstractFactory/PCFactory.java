package AbstractFactoryPattern.src.abstractFactory;

import AbstractFactoryPattern.src.computer.Computer;
import AbstractFactoryPattern.src.computer.PC;

public class PCFactory implements ComputerAbstractFactory {

    private String RAM;
    private String HDD;
    private String CPU;

    public PCFactory(final String RAM, final String HDD, final String CPU) {

        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public Computer createComputer() {
        return new PC(this.RAM, this.HDD, this.CPU);
    }
}
