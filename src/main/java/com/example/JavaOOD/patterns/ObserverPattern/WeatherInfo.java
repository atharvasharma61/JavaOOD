package com.example.JavaOOD.patterns.ObserverPattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherInfo {
    float temperature;
    String location;
    Date date;
}
