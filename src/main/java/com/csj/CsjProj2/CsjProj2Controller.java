package com.csj.CsjProj2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csj.CsjProj2.Model.Employees;
import com.csj.CsjProj2.Model.service.IEmployeeService;

@Controller
public class CsjProj2Controller {
	
	
	
	@Autowired
    private IEmployeeService EmployeeService;
	
	@GetMapping("/showEmployees")
    public String findEmployees(Model model) {


        model.addAttribute("employees", EmployeeService.findAll());

        return "showData";
    }
	
}
