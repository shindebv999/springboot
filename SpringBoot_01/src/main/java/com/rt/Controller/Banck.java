package com.rt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Banck {
	
	@RequestMapping("/index")
	@ResponseBody
	public String Welcome(){
		return "Wel-Come To World Banck...!!";		
	}

}
