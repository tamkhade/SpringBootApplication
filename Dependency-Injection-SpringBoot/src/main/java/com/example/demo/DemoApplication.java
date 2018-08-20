package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
@ComponentScan("com")
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =	SpringApplication.run(DemoApplication.class, args);
		
		Car  c= (Car) applicationContext.getBean(Car.class);
		c.setEngine();
		
		
	}
}
