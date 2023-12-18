package com.example.JavaOOD.patterns.ObserverPattern;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class WeatherStation implements iObservable{
    private final List<iObserver> observers;
    @Getter
    private WeatherInfo weatherInfo;

    public WeatherStation() {
        this.observers = new ArrayList<iObserver>();
        this.weatherInfo = new WeatherInfo();
    }

    @Override
    public void addObserver(iObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(iObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(iObserver observer : observers) {
            observer.inform(this.weatherInfo);
        }
    }

    public void setWeatherInfo(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
        notifyObservers();
    }
}
