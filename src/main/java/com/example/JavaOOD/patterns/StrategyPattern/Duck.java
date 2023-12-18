package com.example.JavaOOD.patterns.StrategyPattern;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class Duck implements iDuck {
    private iFlyBehaviour flyBehaviour;
    private iQuackBehaviour quackBehaviour;
    @Override
    public void fly() {
        this.flyBehaviour.fly();
    }
    @Override
    public void quack() {
        this.quackBehaviour.quack();
    }
}
