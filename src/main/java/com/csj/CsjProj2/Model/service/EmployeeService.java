package com.csj.CsjProj2.Model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csj.CsjProj2.EmployeesRepo;
import com.csj.CsjProj2.Model.Employees;

@Service
public class EmployeeService implements IEmployeeService{

	 @Autowired
	  private EmployeesRepo repository;

	@Override
	public List<Employees> findAll() {
		// TODO Auto-generated method stub
		return (List<Employees>) repository.findAll();
	}


}
