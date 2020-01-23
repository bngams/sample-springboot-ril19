package fr.cesi.rila19.samplespringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// auto configure app
@SpringBootApplication
// manual config
// @ComponentScan => fr.cesi.rila.sprngapp.controllers, services...
public class SampleSpringDemoRil19Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringDemoRil19Application.class, args);
	}

}
