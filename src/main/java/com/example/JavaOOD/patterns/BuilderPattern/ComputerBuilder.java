package com.example.JavaOOD.patterns.BuilderPattern;

public class ComputerBuilder implements iComputerBuilder {
    private Computer computer;

    public ComputerBuilder(Computer computer) {
        this.computer = computer;
    }

    @Override
    public iComputerBuilder buildProcessor(String processor) {
        computer.setProcessor(processor);
        return this;
    }

    @Override
    public iComputerBuilder buildRam(int ram) {
        computer.setRam(ram);
        return this;
    }

    @Override
    public iComputerBuilder buildStorage(int storage) {
        computer.setStorage(storage);
        return this;
    }

    @Override
    public iComputerBuilder buildGraphics(String graphics) {
        computer.setGraphicsCard(graphics);
        return this;
    }

    @Override
    public iComputerBuilder buildOs(String os) {
        computer.setOs(os);
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
