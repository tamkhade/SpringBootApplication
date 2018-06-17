package com.sb.jpa.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sb.jpa.entity.Student;

public interface StudentDao extends JpaRepository<Student, Serializable> {

	public List<Student> findBySname(String sname);

	@Query("select sname from Student")
	public List<String> findStudentNames();
}
