package com.training.voting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoVotersController {
	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}

}
