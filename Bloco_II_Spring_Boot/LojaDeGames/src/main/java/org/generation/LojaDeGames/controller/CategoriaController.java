package org.generation.LojaDeGames.controller;

import java.util.List;

import javax.validation.Valid;

import org.generation.LojaDeGames.model.Categoria;
import org.generation.LojaDeGames.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	@RequestMapping("/categoria")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public class CategoriaController {

		@Autowired
		private CategoriaRepository repository;

		@GetMapping
		public ResponseEntity<List<Categoria>> getAll() {
			return ResponseEntity.ok(repository.findAll());

		}

		@GetMapping("/{id}")
		public ResponseEntity<Categoria> getById(@PathVariable long id) {
			return repository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
					.orElse(ResponseEntity.notFound().build());
		}

		@GetMapping("/titulo/{titulo}")
		public ResponseEntity<List<Categoria>> getByTitulo(@PathVariable String titulo)

		{
			return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
		}

		@PostMapping
		public ResponseEntity<Categoria> postCategoria(@Valid @RequestBody Categoria categoria) {
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
		}

		@PutMapping
		public ResponseEntity<Categoria> putCategoria(@Valid @RequestBody Categoria categoria) {
			return repository.findById(categoria.getId())
					.map(resposta -> ResponseEntity.ok().body(repository.save(categoria)))
					.orElse(ResponseEntity.notFound().build());
		}

		@DeleteMapping
		public ResponseEntity<?> deleteCategoria(@PathVariable long id) {
			return repository.findById(id).map(resposta -> {
				repository.deleteById(id);
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}).orElse(ResponseEntity.notFound().build());
		}
	}
