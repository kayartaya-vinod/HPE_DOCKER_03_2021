package com.hpe.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class DemoController {

	@Autowired
	BookRepository repo;

	@PostMapping(consumes = "application/json", produces = "application/json")
	public Book postHandler(@RequestBody Book book) {
		return repo.save(book);
	}

	@GetMapping
	public Iterable<Book> getHandler() {
		return repo.findAll();
	}

	@GetMapping("/{id}")
	public Book getOneHandler(@PathVariable Integer id) {
		return repo.findById(id).get();
	}
}
