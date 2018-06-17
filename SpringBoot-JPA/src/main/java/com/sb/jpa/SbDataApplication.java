package com.sb.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sb.jpa.entity.Student;
import com.sb.jpa.service.StudentService;

@SpringBootApplication
public class SbDataApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SbDataApplication.class, args);
		StudentService service = context.getBean(StudentService.class);

		boolean status = service.save(new Student(1, "mahesh", "tamkhade21@gmail.com"));
		System.out.println("Record inserted : " + status);

		System.out.println(service.getByName("mahesh"));

		List<String> studentNames = service.getAllStudentNames();
		if (!studentNames.isEmpty()) {
			for (String name : studentNames) {
				System.out.println(name);
			}
		}

	}
}
