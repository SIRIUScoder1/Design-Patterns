package AbstractFactoryPattern.src.Driver;

import AbstractFactoryPattern.src.abstractFactory.PCFactory;
import AbstractFactoryPattern.src.abstractFactory.ServerFactory;
import AbstractFactoryPattern.src.computer.Computer;
import AbstractFactoryPattern.src.computerFactory.ComputerFactory;

public class Main {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16Gb", "1 TB", "2.9 GHz"));

        System.out.println("AbstractFactory for PC " + pc);
        System.out.println("AbstractFactory for Server " + server);
    }
}
