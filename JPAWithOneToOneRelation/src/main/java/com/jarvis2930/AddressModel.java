package com.jarvis2930;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AddressModel")
public class AddressModel 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name = "aId")
	private int aId;
	@Column (name = "address")
	private String address;
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
