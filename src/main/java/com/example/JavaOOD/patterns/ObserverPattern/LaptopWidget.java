package com.example.JavaOOD.patterns.ObserverPattern;

public class LaptopWidget implements iObserver {
    private WeatherInfo weatherInfo;
    @Override
    public void display() {
        System.out.println("LaptopWidget display: " +
                this.weatherInfo.getTemperature() + ", " +
                this.weatherInfo.getLocation() + ", " +
                this.weatherInfo.getDate());
    }

    @Override
    public void inform(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
        display();
    }
}
