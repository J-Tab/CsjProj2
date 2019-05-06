package com.csj.CsjProj2;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CsjProj2Controller {
	@GetMapping("/")
	public String echoTheUsersEmailAddress(Principal principal) {
		return "Hey there! Your email address is: " + principal.getName() ;
	
	}
	
}
