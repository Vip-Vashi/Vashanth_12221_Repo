package com.hibernate.matrimonial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.hibernate.matrimonial.model.Register;
import com.hibernate.matrimonial.repository.RegisterRepo;

@Service
public class RegisterServiceImpl implements RegisterService{

	RegisterRepo repo;
	public RegisterServiceImpl(RegisterRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void adduser(Register user) {
		
		repo.save(user);
	}

	@Override
	public List<Register> getall() {
				return repo.findAll();
	}

	

		 public Optional<Register> getuser(int uid) {
				
				return   repo.findById(uid);
			}

}
