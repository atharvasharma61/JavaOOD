package com.example.JavaOOD.patterns.StrategyPattern;

public class FlyBehaviourImpl1 implements iFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am FlyBehaviourImpl1");
    }
}
