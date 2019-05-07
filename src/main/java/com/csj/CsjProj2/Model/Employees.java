package com.csj.CsjProj2.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees {
	

	@Id
	private Integer emp_no;
	
	private String birth_date;
	
	private String first_name;
	
	private String last_name;
	
	private String gender;
	
	private String hire_date;
	
	public Employees() {
		
	}
	
	public Employees(Integer emp_no, String birth_date, String first_name, String last_name, String gender, String hire_date) {
		this.emp_no = emp_no;
		this.birth_date = birth_date;
		this.first_name= first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.hire_date = hire_date;
	}
	
	public Integer getId() {
		return emp_no;
	}
	
	public void setId(int Id) {
		emp_no = Id;
	}
	
	public String getFirstName() {
		return first_name;
	}
	
	public void setFirstName(String name) {
		first_name = name;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public void setLastName(String name) {
		last_name = name;
	}
	
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String G) {
		gender = G;
	}
	
	public String getBirthDate() {
		return birth_date;
	}
	
	public void setBirthDate(String date) {
		birth_date = date;
	}
	
	public String getHireDate() {
		return hire_date;
	}
	
	public void setHireDate(String date) {
		hire_date = date;
	}
}
