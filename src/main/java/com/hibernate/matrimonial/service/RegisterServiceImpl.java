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
		// TODO Auto-generated method stub
		repo.save(user);
	}

	@Override
	public List<Register> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateuser(Register user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteuser(int uid) {
		// TODO Auto-generated method stub
		
	}
	   
		 public Optional<Register> getuser(int uid) {
				
				return   repo.findById(uid);
			}

}
