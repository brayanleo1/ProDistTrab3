package com.imd.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imd.model.Pacote;
import com.imd.repository.PacoteRepository;

@RestController
@RequestMapping("/pacote")
public class PacoteController {
	@Autowired
	private PacoteRepository pacoteRepository;
	@GetMapping("{id}")
	public ResponseEntity<Optional<Pacote>> getPacote(@PathVariable long id) {
		Optional<Pacote> pac = pacoteRepository.findById(id);
		if(pac != null) {
			return ResponseEntity.ok(pac);
		} else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@PostMapping
	public ResponseEntity<Pacote> inserirPacote(@RequestBody Pacote pac) {
		return ResponseEntity.ok(pacoteRepository.save(pac));
	}
	
	@PutMapping
	public ResponseEntity<Pacote> atualizarPacote(@RequestBody Pacote pac) {
		return ResponseEntity.ok(pacoteRepository.save(pac));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Pacote> removerPacote(@PathVariable long id) {
		pacoteRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("fabrica/{id}")
	public ResponseEntity<Pacote> removerPacoteFabrica(@PathVariable long id) {
		pacoteRepository.deleteFromFabrica(id);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("loja/{id}")
	public ResponseEntity<Pacote> removerPacoteLoja(@PathVariable long id) {
		pacoteRepository.deleteFromLoja(id);
		return ResponseEntity.ok().build();
	}
}
