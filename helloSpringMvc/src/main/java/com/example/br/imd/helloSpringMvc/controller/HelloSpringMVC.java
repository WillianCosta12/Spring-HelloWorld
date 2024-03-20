package com.example.br.imd.helloSpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.br.imd.helloSpringMvc.negocio.Message;

@Controller
public class HelloSpringMVC {

	@Autowired
	Message msg;
	
	@GetMapping("/helloMsg")
	public String hello(@RequestParam(value = "name", required = false) 
		String name,  Model model) {
		
		model.addAttribute("name", msg.message(name));
		
		return "hello";

	}
}
