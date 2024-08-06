package com.example.JavaOOD;

import com.example.JavaOOD.patterns.BuilderPattern.BuilderPattern;
import com.example.JavaOOD.patterns.DecoratorPattern.DecoratorPattern;
import com.example.JavaOOD.patterns.FactoryPattern.FactoryPattern;
import com.example.JavaOOD.patterns.ObserverPattern.ObserverPattern;
import com.example.JavaOOD.patterns.SingletonPattern.SingletonPattern;
import com.example.JavaOOD.patterns.StrategyPattern.StrategyPattern;
import com.example.JavaOOD.patterns.iPattern;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class JavaOodApplication {

	public static void main(String[] args) {
//		iPattern pattern = new StrategyPattern();
//		iPattern pattern = new ObserverPattern();
//		iPattern pattern = new FactoryPattern();
//		iPattern pattern = new SingletonPattern();
//		iPattern pattern = new DecoratorPattern();
		iPattern pattern = new BuilderPattern();
		pattern.run();
	}

}
