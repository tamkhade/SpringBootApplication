package com.jarvis2930;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {

	@Autowired
	UniversityDao universityDao;
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);

	}

	@PostConstruct
	public void init(){
		System.out.println("MyService init method called");
		UniversityModel puneuniversityModel = new UniversityModel();
		puneuniversityModel.setUniversityName("pune uni");

		UniversityModel mumbaiUniverSityModel = new UniversityModel();
		mumbaiUniverSityModel.setUniversityName("Mumbai uni");


		CollegeModel icoerCollege = new CollegeModel();
		icoerCollege.setCollegeName("Icoer");

		CollegeModel bhivrabaiCollege = new CollegeModel();
		bhivrabaiCollege.setCollegeName("Bhivrabai");
		
		List<UniversityModel> unversity = new ArrayList<UniversityModel>();
		unversity.add(puneuniversityModel);
		unversity.add(mumbaiUniverSityModel);
		
		List<CollegeModel> colleges = new ArrayList<CollegeModel>();
		colleges.add(icoerCollege);
		colleges.add(bhivrabaiCollege);
		
		puneuniversityModel.setCollegeList(colleges);
		mumbaiUniverSityModel.setCollegeList(colleges);
		
		icoerCollege.setUniversityModelList(unversity);
		bhivrabaiCollege.setUniversityModelList(unversity);
		
		/*puneuniversityModel.getCollegeList().add(icoerCollege);
		puneuniversityModel.getCollegeList().add(bhivrabaiCollege);
		mumbaiUniverSityModel.getCollegeList().add(icoerCollege);
		icoerCollege.getUniversityModelList().add(puneuniversityModel);
		icoerCollege.getUniversityModelList().add(mumbaiUniverSityModel);
		bhivrabaiCollege.getUniversityModelList().add(puneuniversityModel);*/
	
		universityDao.saveAndFlush(puneuniversityModel);

		universityDao.flush();
		
	}





}
