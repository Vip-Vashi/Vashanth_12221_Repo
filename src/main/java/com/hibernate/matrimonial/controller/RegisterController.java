package com.hibernate.matrimonial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.matrimonial.model.Register;
import com.hibernate.matrimonial.service.RegisterServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/registration")
public class RegisterController {
RegisterServiceImpl service;



public RegisterController(RegisterServiceImpl service) {
	super();
	this.service = service;
}


@PostMapping
public String insertuser(@RequestBody Register user) {

	String msg = "";
	try {
		service.adduser(user);
		msg = "success";
	} catch (Exception e) {
		msg = "failure";
	}
	return msg;

}

@GetMapping("{uid}")
public Optional<Register> getbyId(@PathVariable("uid") int id) {

	return service.getuser(id);

}

@GetMapping("/all")
public List<Register> getusers() {

	return service.getall();

}
	
	
}
