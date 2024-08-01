package com.hibernate.matrimonial.service;

import static org.junit.jupiter.api.Assertions.*;

//import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hibernate.matrimonial.model.Matchmaker;
import com.hibernate.matrimonial.model.User;
//import com.hibernate.matrimonial.repository.UserRepository;
@SpringBootTest
class UserServiceImplTest {
 
	@Autowired
	UserServiceImpl userServiceImpl;

//	@Test
//	void testGetUserById() {
//		assertNotNull(userServiceImpl.getUserById(11));
//	}

	@Test
	@Order(1)
	void testSaveUser() {
		Matchmaker matchmaker = new Matchmaker(
				6, "Subramaniyan", "8899001123", "Gandipuram,Coimbatore");
				
		
		User user = new User(
		0,
		"Babu",
		"Groom","No-9,BalrangaPuram,Madurrai",30,"IT","Monthly","Hindu","60000","Unmarried",matchmaker);
		
		
		
		assertEquals("Success", userServiceImpl.saveUser(user));
	}
//	
	@Test
	
	void testSaveUserIFNull() {
	
		User user = null;
		
		
		assertEquals("Failure", userServiceImpl.saveUser(user));
	}

//	@Test
//	
//	void testDeleteUser() {
//		assertEquals("Success",userServiceImpl.deleteUser(21));
//	}
//	
	@Test
	
	void testDeleteUserIfNotPresentOrNull() {
		assertEquals("Failure",userServiceImpl.deleteUser(80));
	}
//
//	@Test
//	void testUpdateUser() {
//		Matchmaker matchmaker = new Matchmaker(
//				6, "SubramaniyanKumran", "8899001123", "Gandhipuram,Coimbatore");
//				
//		
//		User user = new User(
//		19,
//		"NandhaKumaran",
//		"Groom","No-9,NanjuPuram,Virudhunagar",40,"IT-Tester","Monthly","Hindu","20000","Unmarried",matchmaker);
//		
//		
//		
//		assertEquals("Success", userServiceImpl.updateUser(user));
//	}
	
	@Test
	void testUpdateUserIfNotPresentOrNUll() {
		Matchmaker matchmaker = new Matchmaker(
				6, "SubramaniyanKumaran", "8899001123", "Gandhipuram,Coimbatore");
				
		
		User user = new User(
		1000,
		"NandhuKumaran",
		"Groom","No-9,NanjuPuram,Virudhunagar",40,"IT-Tester","Monthly","Hindu","20000","Unmarried",matchmaker);
		
		
		
		assertEquals("Failed", userServiceImpl.updateUser(user));
	}
//
//	@Test
//	@Order(2)
//	void testGetAllUsers() {
//		assertEquals(5, userServiceImpl.getAllUsers().size());
//	}

	

}
