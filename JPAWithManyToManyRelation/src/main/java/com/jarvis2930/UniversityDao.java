package com.jarvis2930;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface UniversityDao extends JpaRepository<UniversityModel, Long> 
{
	
	public UniversityModel saveAndFlush(UniversityModel listUnivertsity);

}
