package AbstractFactoryPattern.src.computerFactory;

import AbstractFactoryPattern.src.abstractFactory.ComputerAbstractFactory;
import AbstractFactoryPattern.src.computer.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {

        return factory.createComputer();
    }
}
