package com.example.br.imd.helloSpringMvc.negocio;

import org.springframework.stereotype.Component;

@Component
public class Message {

	public String message(String name) {
		return name==null? "World" : name;
	}
	
}
