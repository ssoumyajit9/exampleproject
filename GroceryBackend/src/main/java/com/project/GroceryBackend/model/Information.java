package com.project.GroceryBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Grocery_information_Details")
public class Information 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name = "office_name")
	public String officeName;
	
	
	@Column(name = "office_phone")
	public String Phone;
	
	@Column(name = "office_address")
	public String officeAddress;
	
	@Column(name = "office_email")
	public String officemail;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getOfficemail() {
		return officemail;
	}
	public void setOfficemail(String officemail) {
		this.officemail = officemail;
	}
	
}
