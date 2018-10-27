package AbstractFactoryPattern.src.computer;

public class PC extends Computer {

    private String RAM;
    private String HDD;
    private String CPU;

    public PC(final String RAM, final String HDD, final String CPU) {

        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }
}
