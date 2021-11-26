package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/")
	public String accueil(Model model) {
				
		return "Accueil";
	}
	
	@PostMapping("/bonjour")
	public String bonjour(@RequestParam("prenom") String prenom, Model model) {
		String message = "Bonjour " + prenom + ",\n vous êtes bien matinale";
		
		model.addAttribute("message", message);
		System.out.println(message);
		log.info(message);
		
		return "Accueil";
	}

}
