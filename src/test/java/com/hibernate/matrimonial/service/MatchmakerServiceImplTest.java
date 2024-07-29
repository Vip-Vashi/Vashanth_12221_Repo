package com.hibernate.matrimonial.service;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hibernate.matrimonial.model.Matchmaker;
@SpringBootTest
class MatchmakerServiceImplTest {

	@Autowired
	MatchmakerServiceImpl matchmakerServiceImpl;
	@Test
	void testGetmatchmakerById() {
		assertNotNull(matchmakerServiceImpl.getmatchmakerById(1));
	}

	@Test
	void testSaveMatchmaker() {
		Matchmaker matchmaker = new Matchmaker(0, "Rajesh", "8899001123", "Chinnamanoor,Theni");
		assertEquals("Success", matchmakerServiceImpl.saveMatchmaker(matchmaker));
	}
	@Test
	void testSaveMatchmakerIfNull() {
		Matchmaker matchmaker =(null);
		assertEquals("Failed", matchmakerServiceImpl.saveMatchmaker(matchmaker));
	}

//	@Test
//	@Order(1)
//	void testDeleteMatchmaker() {
//         assertEquals("Success", matchmakerServiceImpl.deleteMatchmaker(8));
//	}
	@Test
	@Order(2)
	void testDeleteMatchmakerIfNotPresent() {
         assertEquals("Failure", matchmakerServiceImpl.deleteMatchmaker(8));
	}

//	@Test
//	void testUpdateMatchmaker() {
//		Matchmaker matchmaker = new Matchmaker(6, "SubramaniyanKumaran", "8899001123", "Gandhipuram,Coimbatore");
//		assertEquals("Success",matchmakerServiceImpl.updateMatchmaker(matchmaker));
//	}
//	
//	@Test
//	void testUpdateMatchmakerIfNullOrNotPresent() {
//		Matchmaker matchmaker = new Matchmaker(99,"naveen","8899","Theni");
//		assertEquals("Failed",matchmakerServiceImpl.updateMatchmaker(matchmaker));
//	}
//////	
//	
//	@Test
//	void testGetAll() {
//		assertEquals(7, matchmakerServiceImpl.getAll().size());
//	}

}
