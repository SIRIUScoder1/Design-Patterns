package FactoryPattern.src.factory;

import FactoryPattern.src.computer.Computer;
import FactoryPattern.src.computer.PC;
import FactoryPattern.src.computer.Server;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {

        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
        return null;
    }
}
