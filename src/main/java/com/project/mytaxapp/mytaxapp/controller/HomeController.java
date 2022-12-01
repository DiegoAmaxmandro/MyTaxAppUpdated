package com.project.mytaxapp.mytaxapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
//	@GetMapping("/dash")
//	public String dash() {
//		return "dash";
//	}

}
