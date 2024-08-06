package com.example.JavaOOD.patterns.DecoratorPattern;

public class WhippedCreamAddOn extends AddOnDecorator {
    public WhippedCreamAddOn(iBeverage beverage) {
        super(beverage);
    }
    @Override
    public double getCost() {
        return 3 + beverage.getCost();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with Whipped Cream";
    }
}
