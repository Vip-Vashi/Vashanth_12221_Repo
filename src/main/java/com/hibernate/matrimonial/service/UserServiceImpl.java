package com.hibernate.matrimonial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hibernate.matrimonial.model.User;
import com.hibernate.matrimonial.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	String success = "Success";
	String fail = "Failure";
   private  UserRepository repo;
 
	public UserServiceImpl(UserRepository repo) {
	super();
	this.repo = repo;
}

	@Override
	public User getUserById(int id) {
		
		return repo.findUById(id);
	}

	@Override
	public String saveUser(User user) {
		
		if(user!=null) {
			repo.saveU(user);
			return success;
		}
		else {
			return fail;
		}
		
	}

	@Override
	public String deleteUser(int id) {
		
		if(repo.findUById(id)!=null) {
			repo.deleteU(id);
			return success;
		}
		else {
			return fail;
		}
	
		
	}

	@Override
	public String updateUser(User user) {
		
		if(repo.findUById(user.getUid())!= null) {
		repo.updateU(user);
		return success;
		}
		else {
			return "Failed";
		}
	}

	@Override
	public List<User> getAllUsers() {
	
		return repo.findAllUsers();
	}

}
