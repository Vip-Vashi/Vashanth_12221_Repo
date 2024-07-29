package com.hibernate.matrimonial.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.matrimonial.model.Matchmaker;

import com.hibernate.matrimonial.service.MatchmakerService;


@CrossOrigin("http://localhost:3001,http://localhost:3000")
@RestController
@RequestMapping("/match")
public class MatchmakerController {
	
	private final MatchmakerService service;

	

	public MatchmakerController(MatchmakerService service) {
		super();
		this.service = service;
	}

	@GetMapping("/all")
	public List<Matchmaker> getAllUsers() {
		return service.getAll();
	}

	@GetMapping("/{mid}")
	public Matchmaker getUserById(@PathVariable int mid) {
		return service.getmatchmakerById(mid);
	}

	@PostMapping
	public void createUser(@RequestBody Matchmaker matchmaker) {
		service.saveMatchmaker(matchmaker);
	}

	@PutMapping("/{mid}")
	public void updateUser(@RequestBody Matchmaker matchmaker) {
		service.updateMatchmaker(matchmaker);
	}

	@DeleteMapping("/{mid}")
	public void deleteUser(@PathVariable("mid") int id) {
		service.deleteMatchmaker(id);
	}
}
