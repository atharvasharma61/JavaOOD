package com.example.JavaOOD.patterns.BuilderPattern;

public interface iComputerBuilder {
    iComputerBuilder buildProcessor(String processor);
    iComputerBuilder buildRam(int ram);
    iComputerBuilder buildStorage(int storage);
    iComputerBuilder buildGraphics(String graphics);
    iComputerBuilder buildOs(String os);
    Computer build();
}