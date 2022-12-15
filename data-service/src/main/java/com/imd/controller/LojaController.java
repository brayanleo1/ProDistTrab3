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

import com.imd.model.Loja;
import com.imd.repository.LojaRepository;

@RestController
@RequestMapping("/loja")
public class LojaController {
	@Autowired
	private LojaRepository lojaRepository;
	@GetMapping("{id}")
	public ResponseEntity<Optional<Loja>> getLoja(@PathVariable long id) {
		Optional<Loja> prod = lojaRepository.findById(id);
		if(prod != null) {
			return ResponseEntity.ok(prod);
		} else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@PostMapping
	public ResponseEntity<Loja> inserirLoja(@RequestBody Loja prod) {
		return ResponseEntity.ok(lojaRepository.save(prod));
	}
	
	@PutMapping
	public ResponseEntity<Loja> atualizarLoja(@RequestBody Loja prod) {
		return ResponseEntity.ok(lojaRepository.save(prod));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Loja> removerLoja(@PathVariable long id) {
		lojaRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
