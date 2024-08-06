package com.example.JavaOOD.patterns.SingletonPattern;

import com.example.JavaOOD.patterns.iPattern;

public class SingletonPattern implements iPattern {
    @Override
    public void run() {
        Singleton instance = Singleton.getInstance();
        instance.doSomething();
    }
}
