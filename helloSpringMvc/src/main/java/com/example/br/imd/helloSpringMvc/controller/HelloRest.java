package com.example.br.imd.helloSpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.br.imd.helloSpringMvc.negocio.Message;

@RestController
public class HelloRest {

	@Autowired
	Message msg;
	
	@GetMapping("/helloRest")
	public String hello(@RequestParam(value = "name", required = false) 
		String name,  Model model) {
		
		model.addAttribute("name", msg.message(name));
		
		return String.format("Hello %s!", msg.message(name));

	}
	
}
