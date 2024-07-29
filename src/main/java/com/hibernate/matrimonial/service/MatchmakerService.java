package com.hibernate.matrimonial.service;

import java.util.List;

import com.hibernate.matrimonial.model.Matchmaker;



public interface MatchmakerService {
	
	Matchmaker getmatchmakerById(int mid);

	String saveMatchmaker(Matchmaker matchmaker);

	String deleteMatchmaker(int mid);

	String updateMatchmaker(Matchmaker matchmaker);

	List<Matchmaker> getAll();
}
