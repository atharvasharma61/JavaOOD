package com.example.JavaOOD.patterns.DecoratorPattern;

public class Coffee implements iBeverage {
    @Override
    public String getDescription() {
        return "Regular Coffee";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
