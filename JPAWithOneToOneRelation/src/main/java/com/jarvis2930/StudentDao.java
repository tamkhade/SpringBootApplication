package com.jarvis2930;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface StudentDao extends JpaRepository<StudentModel, Long> {
	
	public StudentModel save(StudentModel studentModel);

	public StudentModel saveAndFlush(StudentModel addressModel);

}
