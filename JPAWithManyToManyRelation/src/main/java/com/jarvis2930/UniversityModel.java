package com.jarvis2930;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity

public class UniversityModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name = "universityId")
	private int universityId;
	@Column(name="universityName")
	private String universityName;
	
    @ManyToMany(cascade = CascadeType.ALL)

    @JoinTable(name = "ThirdTable",joinColumns = { @JoinColumn(name = "universityId") }, inverseJoinColumns = { @JoinColumn(name = "collegeId")})

	List<CollegeModel> CollegeList /*= new ArrayList<>()*/;

	
	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public List<CollegeModel> getCollegeList() {
		return CollegeList;
	}

	public void setCollegeList(List<CollegeModel> collegeList) {
		CollegeList = collegeList;
	}
}
