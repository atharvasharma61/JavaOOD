package com.example.JavaOOD.patterns.DecoratorPattern;

public abstract class AddOnDecorator implements iBeverage {
    protected iBeverage beverage;
    public AddOnDecorator(iBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double getCost() {
        return beverage.getCost();
    }
}
