package ua.edu.duan.gof;

public class Computer {
    private final Cpu cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void runProgram(String path){
        hardDrive.readProgram(path);
        memory.loadData(path);
        cpu.calculate(path);
    }
}
