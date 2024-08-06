package com.example.JavaOOD.patterns.SingletonPattern;

public class Singleton {
    static private Singleton instance;
    private Singleton() {

    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Doing something");
    }
}
