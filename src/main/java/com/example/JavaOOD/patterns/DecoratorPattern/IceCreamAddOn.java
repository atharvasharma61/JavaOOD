package com.example.JavaOOD.patterns.DecoratorPattern;

public class IceCreamAddOn extends AddOnDecorator {
    public IceCreamAddOn(iBeverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with Ice Cream";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 22.0;
    }
}
