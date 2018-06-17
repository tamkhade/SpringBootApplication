package com.sb.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.jpa.dao.StudentDao;
import com.sb.jpa.entity.Student;

@Service
public class StudentService {

	@Autowired(required = true)
	private StudentDao dao;

	public boolean save(Student s) {
		Student stu = dao.save(s);
		return (stu != null) ? true : false;
	}

	public Student findById(Integer sid) {
		return dao.findOne(sid);
	}

	public List<Student> getAll() {
		return dao.findAll();
	}

	public List<Student> getByName(String sname) {
		return dao.findBySname(sname);
	}

	public List<String> getAllStudentNames() {
		return dao.findStudentNames();
	}

}
