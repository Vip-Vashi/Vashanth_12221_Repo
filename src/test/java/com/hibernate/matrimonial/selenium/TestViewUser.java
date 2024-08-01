package com.hibernate.matrimonial.selenium;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class TestViewUser {

	WebDriver driver;
	@BeforeEach
	public void setUp() {
		driver = new ChromeDriver();
	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}
	  
	  @Test
		void ViewUserPage() throws InterruptedException {
		  driver.get("http://localhost:3000/");
		   driver.findElement(By.linkText("Features")).click();
		   driver.findElement(By.linkText("Our Customers")).click();
		  
//			
		    assertEquals("http://localhost:3000/viewuser",driver.getCurrentUrl());
		}
	  
	  @Test
		void ViewMatchMakerPage() throws InterruptedException {
		  driver.get("http://localhost:3000/");
		   driver.findElement(By.linkText("Features")).click();
		   driver.findElement(By.linkText("Match Makers")).click();
		  
//			
		    assertEquals("http://localhost:3000/view",driver.getCurrentUrl());
		}

}
