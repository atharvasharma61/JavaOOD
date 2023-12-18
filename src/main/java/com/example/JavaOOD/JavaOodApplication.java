package com.example.JavaOOD;

import com.example.JavaOOD.patterns.FactoryPattern.FactoryPattern;
import com.example.JavaOOD.patterns.ObserverPattern.ObserverPattern;
import com.example.JavaOOD.patterns.StrategyPattern.StrategyPattern;
import com.example.JavaOOD.patterns.iPattern;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class JavaOodApplication {

	public static void main(String[] args) {
//		iPattern pattern = new StrategyPattern();
//		iPattern pattern = new ObserverPattern();
		iPattern pattern = new FactoryPattern();
		pattern.run();
	}

}
