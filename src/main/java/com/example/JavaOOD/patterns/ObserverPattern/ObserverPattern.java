package com.example.JavaOOD.patterns.ObserverPattern;

import com.example.JavaOOD.patterns.iPattern;

import java.util.Date;

public class ObserverPattern implements iPattern {
    @Override
    public void run() {
        WeatherStation weatherStation = new WeatherStation();
        MobileWidget mobileWidget = new MobileWidget();
        weatherStation.addObserver(mobileWidget);

        LaptopWidget laptopWidget = new LaptopWidget();
        weatherStation.addObserver(laptopWidget);

        WeatherInfo updatedWeatherInfo = new WeatherInfo(55.3f, "EU", new Date());
        weatherStation.setWeatherInfo(updatedWeatherInfo);

        updatedWeatherInfo = new WeatherInfo(65.3f, "CN", new Date());
        weatherStation.setWeatherInfo(updatedWeatherInfo);

        weatherStation.removeObserver(mobileWidget);

        updatedWeatherInfo = new WeatherInfo(75.3f, "CN", new Date());
        weatherStation.setWeatherInfo(updatedWeatherInfo);
    }
}
