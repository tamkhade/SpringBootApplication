package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class ApplicationConfig 
{

	 @Bean
	 @Qualifier
	   public Engine marutiEngine()
	   {
	    return new MarutiEngine();
	   }
	 
	 @Qualifier
	   public Engine tataEngine()
	   {
	    return new TataEngine();
	   }

}
