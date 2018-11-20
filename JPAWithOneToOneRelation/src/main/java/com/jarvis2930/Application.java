package com.jarvis2930;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {

	@Autowired
	StudentDao studentDao;
	public static void main(String[] args) 
	{
        SpringApplication.run(Application.class, args);
        
	}
	
	@PostConstruct
	public void init(){
		System.out.println("MyService init method called");

		StudentModel studentModel = new StudentModel();
		studentModel.setName("Mahesh");
		
		AddressModel addressModel = new AddressModel();
		addressModel.setAddress("pune");
		studentModel.setAddressModel(addressModel);
		
		studentDao.saveAndFlush(studentModel);
		studentDao.flush();
	}
	
	
	
	

}
