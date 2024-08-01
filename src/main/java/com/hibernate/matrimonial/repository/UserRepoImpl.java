package com.hibernate.matrimonial.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.matrimonial.model.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserRepoImpl implements UserRepository {

	@Autowired
	EntityManager eManager;

	public User findUById(int id) {
		
		return eManager.find(User.class, id);
	}

	@Override
	public void saveU(User user) {
		
		eManager.persist(user);
		
	}

	@Override
	public void deleteU(int id) {
		
		User userToDelete = findUById(id);
		if (userToDelete != null) {
			eManager.remove(userToDelete);
		}
	}

	@Override
	public void updateU(User user) {
		eManager.merge(user);
		
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		String hql = "from User";
		Query query = eManager.createQuery(hql);
		return query.getResultList();
	}

}
