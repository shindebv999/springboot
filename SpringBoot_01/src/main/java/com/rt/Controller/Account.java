package com.rt.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Account {
	
	@RequestMapping("/account")
	public String AcccountDetails(){
		return "Account Details Here ";		
	}

}
