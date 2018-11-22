package com.jarvis2930;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class CollegeModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name = "collegeId")
	private int collegeId;

	@Column(name="collegeName")
	private String collegeName;
	
	@ManyToMany(mappedBy="CollegeList")

	List<UniversityModel> universityModelList /*= new ArrayList<>()*/;

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public List<UniversityModel> getUniversityModelList() {
		return universityModelList;
	}

	public void setUniversityModelList(List<UniversityModel> universityModelList) {
		this.universityModelList = universityModelList;
	}
	
}
