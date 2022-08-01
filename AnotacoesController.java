package br.com.generation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/Anotacoes")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class AnotacoesController {
	
	@Autowired
	private AnotacoesRepository anotacoesRepository;
	
	@GetMapping
	public ResponseEntity<List<Anotacoes>> getAll(){
		return ResponseEntity.ok(anotacoesRepository.findAll());
	}

}
