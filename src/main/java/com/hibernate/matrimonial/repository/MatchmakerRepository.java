package com.hibernate.matrimonial.repository;

import java.util.List;

import com.hibernate.matrimonial.model.Matchmaker;


public interface MatchmakerRepository {
	Matchmaker findUById(int mid);

	void savem(Matchmaker matchmaker);

	void deletem(int mid);

	void updatem(Matchmaker matchmaker);

	List<Matchmaker> findAllmatch();
}
