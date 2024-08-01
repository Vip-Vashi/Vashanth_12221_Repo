package com.hibernate.matrimonial.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.matrimonial.model.Matchmaker;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class MatchmakerRepoImpl implements MatchmakerRepository{
	@Autowired
	EntityManager eManager;
	@Override
	public Matchmaker findUById(int mid) {
		
		return  eManager.find(Matchmaker.class, mid);
	}

	@Override
	public void savem(Matchmaker matchmaker) {
		
		eManager.persist(matchmaker);
		
	}

	@Override
	public void deletem(int mid) {
		
		Matchmaker matchToDelete = findUById(mid);
		if (matchToDelete != null) {
			eManager.remove(matchToDelete);
		}
	}

	@Override
	public void updatem(Matchmaker matchmaker) {
		// TODO Auto-generated method stub
		eManager.merge(matchmaker);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Matchmaker> findAllmatch() {
	
		String hql = "from Matchmaker";
		Query query = eManager.createQuery(hql);
		return query.getResultList();
		
	}

}
