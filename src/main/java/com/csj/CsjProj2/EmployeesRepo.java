package com.csj.CsjProj2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.csj.CsjProj2.Model.Employees;


@Repository
public interface EmployeesRepo extends CrudRepository<Employees, Long>{

}
