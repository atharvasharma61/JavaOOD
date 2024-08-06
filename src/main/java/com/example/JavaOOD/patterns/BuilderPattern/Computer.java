package com.example.JavaOOD.patterns.BuilderPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer {
    private String processor;
    private String motherboard;
    private int ram;
    private int storage;
    private String graphicsCard;
    private String os;
}