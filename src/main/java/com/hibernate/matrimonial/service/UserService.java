package com.hibernate.matrimonial.service;

import java.util.List;

import com.hibernate.matrimonial.model.User;



public interface UserService {
	User getUserById(int id);

	String saveUser(User user);

	String deleteUser(int id);

	String updateUser(User user);

	List<User> getAllUsers();
}
