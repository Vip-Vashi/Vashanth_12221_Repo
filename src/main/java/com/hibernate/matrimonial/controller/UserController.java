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

import com.hibernate.matrimonial.model.User;
import com.hibernate.matrimonial.service.UserService;


@CrossOrigin("http://localhost:3001,http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/all")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{uid}")
	public User getUserById(@PathVariable int uid) {
		return userService.getUserById(uid);
	}

	@PostMapping
	public void createUser(@RequestBody User user) {
		userService.saveUser(user);
	}

	@PutMapping("/{uid}")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}

	@DeleteMapping("/{uid}")
	public void deleteUser(@PathVariable("uid") int id) {
		userService.deleteUser(id);
	}
}
