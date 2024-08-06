package com.example.JavaOOD.patterns.DecoratorPattern;

import com.example.JavaOOD.patterns.iPattern;

public class DecoratorPattern implements iPattern {
    @Override
    public void run() {
        iBeverage coffee = new Coffee();
        coffee = new IceCreamAddOn(coffee);
        coffee = new WhippedCreamAddOn(coffee);
        System.out.println("Coffee Cost: " + coffee.getCost());
        System.out.println("Coffee Description: " + coffee.getDescription());
    }
}
