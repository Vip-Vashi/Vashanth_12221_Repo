package com.hibernate.matrimonial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.matrimonial.model.Register;

public interface RegisterRepo extends JpaRepository<Register, Integer> 
{

}
