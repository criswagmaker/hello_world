package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
		public String hello() {
			return "Hello World";
		}
	@GetMapping("/bsm")
		public String bsm() {
		return "Orientação ao Futuro \nResponsabilidade Pessoal \nMentalidade de Crescimento \nPersistência"
				+"\nTrabalho em Equipe \nAtenção aos Detalhes \nProatividade \nComunicação";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return"Aprender e Desenvolver conhecimentos em Spring";
	}

}
