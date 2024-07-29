package com.hibernate.matrimonial.repository;

import java.util.List;

import com.hibernate.matrimonial.model.User;



public interface UserRepository {
	User findUById(int id);

	void saveU(User user);

	void deleteU(int id);

	void updateU(User user);

	List<User> findAllUsers();
}
