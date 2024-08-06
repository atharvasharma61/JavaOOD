package com.example.JavaOOD.patterns.BuilderPattern;

import com.example.JavaOOD.patterns.iPattern;

public class BuilderPattern implements iPattern {
    @Override
    public void run() {
        Computer baseComputer = new Computer();
        iComputerBuilder computerBuilder = new ComputerBuilder(baseComputer);

        Computer myComputer = computerBuilder.buildGraphics("Nvidia")
                .buildRam(16)
                .buildOs("MacOS")
                .buildStorage(1024)
                .buildProcessor("Silicon")
                .build();

        System.out.println("My Computer's config: " +
                myComputer.getGraphicsCard() + ", " +
                myComputer.getRam() + ", " +
                myComputer.getOs() + ", " +
                myComputer.getStorage() + ", " +
                myComputer.getProcessor() + "."
                );
    }
}
