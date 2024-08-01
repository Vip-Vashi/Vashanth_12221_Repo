package com.hibernate.matrimonial.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class TestAddUserTC {
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
	  void ValidateAddUser() throws InterruptedException {
		  
		
		  driver.get("http://localhost:3000/");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Features")).click();
		    driver.findElement(By.linkText("Our Customers")).click();
		    driver.findElement(By.linkText("Add +")).click();
		  driver.findElement(By.name("uname")).sendKeys("poornima");
		  driver.findElement(By.name("actype")).sendKeys("Bride");
		  driver.findElement(By.name("addr")).sendKeys("kaalvasal,Madurai-08");
		  driver.findElement(By.name("age")).sendKeys("25");
		
		  driver.findElement(By.name("sal")).sendKeys("15000"); 
		  
		  driver.findElement(By.name("job")).sendKeys("Tailor");  
		  driver.findElement(By.name("pay")).sendKeys("Monthly");

		  driver.findElement(By.name("religion")).sendKeys("Hindu");  
		 
	  	 driver.findElement(By.name("sts")).sendKeys("Single");
		 driver.findElement(By.xpath("//option[. = '4']")).click();
		  driver.findElement(By.id("submit")).submit();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		  wait.until(ExpectedConditions.alertIsPresent());
		  assertEquals("Data added Successfully", driver.switchTo().alert().getText());
//		  driver.switchTo().alert().accept();
		  wait.withTimeout(Duration.ofSeconds(5));
	  }
	 
	 
	 
	 @Test
	  void testInvalidAddUserOrNull() throws InterruptedException {
		  
		
		  driver.get("http://localhost:3000/");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Features")).click();
		    driver.findElement(By.linkText("Our Customers")).click();
		    driver.findElement(By.linkText("Add +")).click();
		  driver.findElement(By.name("uname")).sendKeys("ponni");
		  driver.findElement(By.name("actype")).sendKeys("Bride");
		  driver.findElement(By.name("addr")).sendKeys("keelavasal,Madurai-08");
		  driver.findElement(By.name("age")).sendKeys("16");
		
		  driver.findElement(By.name("sal")).sendKeys("15000"); 
		  
		  driver.findElement(By.name("job")).sendKeys("Tailor");  
		  driver.findElement(By.name("pay")).sendKeys("Monthly");

		  driver.findElement(By.name("religion")).sendKeys("Hindu");  
		 
	  	 driver.findElement(By.name("sts")).sendKeys("Single");
		 driver.findElement(By.xpath("//option[. = '4']")).click();
		  driver.findElement(By.id("submit")).submit();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		  wait.until(ExpectedConditions.alertIsPresent());
		  assertEquals("Minimum Age is 18 !!! Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
		  driver.switchTo().alert().accept();
		  wait.withTimeout(Duration.ofSeconds(5));
	  }
	 
	 
	 
	 
	 
	 @Test
	  void testInvalidAddUserDataOrNull() throws InterruptedException {
		  
		
		  driver.get("http://localhost:3000/");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Features")).click();
		    driver.findElement(By.linkText("Our Customers")).click();
		    driver.findElement(By.linkText("Add +")).click();
		  driver.findElement(By.name("uname")).sendKeys("");
		  driver.findElement(By.name("actype")).sendKeys("Bride");
		  driver.findElement(By.name("addr")).sendKeys("keelavasal,Madurai-08");
		  driver.findElement(By.name("age")).sendKeys("16");
		
		  driver.findElement(By.name("sal")).sendKeys("15000"); 
		  
		  driver.findElement(By.name("job")).sendKeys("Tailor");  
		  driver.findElement(By.name("pay")).sendKeys("Monthly");

		  driver.findElement(By.name("religion")).sendKeys("Hindu");  
		 
	  	 driver.findElement(By.name("sts")).sendKeys("Single");
		 driver.findElement(By.xpath("//option[. = '4']")).click();
		  driver.findElement(By.id("submit")).submit();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		  wait.until(ExpectedConditions.alertIsPresent());
		  assertEquals("Please enter Name !!! Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
		  driver.switchTo().alert().accept();
		  wait.withTimeout(Duration.ofSeconds(5));
	  }
	 

}
