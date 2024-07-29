package com.hibernate.matrimonial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hibernate.matrimonial.model.Matchmaker;
import com.hibernate.matrimonial.repository.MatchmakerRepository;
@Service
public class MatchmakerServiceImpl implements MatchmakerService{
    MatchmakerRepository repo;
    
	public MatchmakerServiceImpl(MatchmakerRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Matchmaker getmatchmakerById(int mid) {
		// TODO Auto-generated method stub
		return repo.findUById(mid);
	}

	@Override
	public String saveMatchmaker(Matchmaker matchmaker) {
		// TODO Auto-generated method stub
		if(matchmaker!=null) {
			repo.savem(matchmaker);
			return "Success";
		}
		else {
			return "Failed";
		}
		
	}

	@Override
	public String deleteMatchmaker(int mid) {
		// TODO Auto-generated method stub
		if(repo.findUById(mid)!=null) {
			repo.deletem(mid);
			return "Success";
		}
		else {
			return"Failure";
		}
		
	}

	@Override
	public String updateMatchmaker(Matchmaker matchmaker) {
		// TODO Auto-generated method stub
		if(repo.findUById(matchmaker.getMid())!=null) {
			repo.updatem(matchmaker);
			return"Success";
		}
	else {
		return"Failed";
	}
	}

	@Override
	public List<Matchmaker> getAll() {
		// TODO Auto-generated method stub
		return repo.findAllmatch();
	}

}
