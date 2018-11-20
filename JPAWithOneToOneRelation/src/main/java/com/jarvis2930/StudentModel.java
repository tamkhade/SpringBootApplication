package com.jarvis2930;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class StudentModel 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name = "sId")
	private int sId;
	@Column(name="name")
	private String name;
	
	@JoinColumn
	@OneToOne(cascade = CascadeType.ALL)
	AddressModel addressModel;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressModel getAddressModel() {
		return addressModel;
	}
	public void setAddressModel(AddressModel addressModel) {
		this.addressModel = addressModel;
	}


}
