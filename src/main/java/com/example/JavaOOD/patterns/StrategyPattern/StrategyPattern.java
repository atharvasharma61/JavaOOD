package com.example.JavaOOD.patterns.StrategyPattern;

import com.example.JavaOOD.patterns.iPattern;

public class StrategyPattern implements iPattern {
    @Override
    public void run(){
        iQuackBehaviour quackBehaviour = new QuackBehaviourImpl1();
        iFlyBehaviour flyBehaviour = new FlyBehaviourImpl1();
        Duck duck = new Duck(flyBehaviour, quackBehaviour);
        duck.quack();
        duck.fly();
        flyBehaviour = new FlyBehaviourImpl2();
        duck.setFlyBehaviour(flyBehaviour);
        duck.quack();
        duck.fly();
    }
}
