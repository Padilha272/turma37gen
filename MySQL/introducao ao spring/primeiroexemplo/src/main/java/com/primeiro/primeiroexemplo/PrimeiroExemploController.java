package com.primeiro.primeiroexemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/primeiro")
public class PrimeiroExemploController {

	@GetMapping
	public String primeiro() {
		return "Persistência !\nAtenção aos detalhes!";
		
	}
	
	
}
