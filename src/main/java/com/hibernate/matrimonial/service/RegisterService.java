package com.hibernate.matrimonial.service;

import java.util.List;

import com.hibernate.matrimonial.model.Register;

public interface RegisterService {
	 public void adduser(Register user);
		
		public  List<Register> getall ();
		
		public void updateuser(Register user);
		
		public void deleteuser(int uid);
}
