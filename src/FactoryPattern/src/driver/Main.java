package FactoryPattern.src.driver;

import FactoryPattern.src.factory.ComputerFactory;
import FactoryPattern.src.computer.Computer;

public class Main {

    public static void main(String[] args) {

        Computer pc =  ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("factory PC Config::"+pc);
        System.out.println("factory Server Config::"+server);
    }
}
