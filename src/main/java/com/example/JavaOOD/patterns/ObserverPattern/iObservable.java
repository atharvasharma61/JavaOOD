package com.example.JavaOOD.patterns.ObserverPattern;

public interface iObservable {
    void addObserver (iObserver observer);
    void removeObserver (iObserver observer);
    void notifyObservers();
}
