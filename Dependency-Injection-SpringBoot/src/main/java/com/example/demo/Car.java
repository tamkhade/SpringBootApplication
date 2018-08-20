package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class Car 
{
	@Autowired
	Engine engine;
	
	
	public void setEngine()
	{
		System.out.println("hiiii");
		engine.start();
	}

}
