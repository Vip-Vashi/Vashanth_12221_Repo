package com.hibernate.matrimonial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hibernate.matrimonial.model.Matchmaker;
import com.hibernate.matrimonial.repository.MatchmakerRepository;
@Service
public class MatchmakerServiceImpl implements MatchmakerService{
    MatchmakerRepository repo;
    String success = "Success";
	String fail = "Failure";
	String failed="Failed";
	public MatchmakerServiceImpl(MatchmakerRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Matchmaker getmatchmakerById(int mid) {
		
		return repo.findUById(mid);
	}

	@Override
	public String saveMatchmaker(Matchmaker matchmaker) {
		
		if(matchmaker!=null) {
			repo.savem(matchmaker);
			return success;
		}
		else {
			return failed;
		}
		
	}

	@Override
	public String deleteMatchmaker(int mid) {
		
		if(repo.findUById(mid)!=null) {
			repo.deletem(mid);
			return success;
		}
		else {
			return fail;
		}
		
	}

	@Override
	public String updateMatchmaker(Matchmaker matchmaker) {
		
		if(repo.findUById(matchmaker.getMid())!=null) {
			repo.updatem(matchmaker);
			return success;
		}
	else {
		return failed;
	}
	}

	@Override
	public List<Matchmaker> getAll() {
		
		return repo.findAllmatch();
	}

}
