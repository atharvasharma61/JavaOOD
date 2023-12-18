package com.example.JavaOOD.patterns.StrategyPattern;

public class QuackBehaviourImpl1 implements iQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I am quackBehaviourImpl1");
    }
}
