package com.segundoexemplo.segundoexemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segundo")
public class SegundoExemploController {

	
	@GetMapping
	public String segundo() {
		return "Introdução ao Spring!";
		
	}
}
