package com.hibernate.matrimonial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hibernate.matrimonial.model.User;
import com.hibernate.matrimonial.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
   private  UserRepository repo;
 
	public UserServiceImpl(UserRepository repo) {
	super();
	this.repo = repo;
}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return repo.findUById(id);
	}

	@Override
	public String saveUser(User user) {
		// TODO Auto-generated method stub
		if(user!=null) {
			repo.saveU(user);
			return "Success";
		}
		else {
			return "Failure";
		}
		
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		if(repo.findUById(id)!=null) {
			repo.deleteU(id);
			return "Success";
		}
		else {
			return"Failure";
		}
	
		
	}

	@Override
	public String updateUser(User user) {
		// TODO Auto-generated method stub
		if(repo.findUById(user.getUid())!= null) {
		repo.updateU(user);
		return "Success";
		}
		else {
			return "Failed";
		}
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAllUsers();
	}

}
