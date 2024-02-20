package com.pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupsTesting {
	WebDriver driver;
	
//	@Test(groups="smoke")
	
	
	
	
	public void funcTest()
	{
		System.out.println("Functional test is done");
	}
	
	
	public void smokeTest() throws InterruptedException
	{
		System.out.println("functional test is done");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//
//		driver.get("https://medsolbuffer.in/login");

		driver.findElement(By.id("email")).sendKeys("puneeth1882@hms.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Accountants')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'New Accountant')]")).click();
		Thread.sleep(2000);
		
		WebElement nameInput=driver.findElement(By.xpath("//input[@id='first_name']"));
		 String dynamicName = "Puneeth" + UUID.randomUUID().toString() ;
		 
		 nameInput.sendKeys(dynamicName);
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("xyz");
		WebElement emailInput= driver.findElement(By.xpath("//input[@id='createAccountantEmail']"));
		
		 String dynamicEmail = "user" + UUID.randomUUID().toString() + "@hms.com";
	        emailInput.sendKeys(dynamicEmail);
	        
	     
	        
	        driver.findElement(By.xpath("//input[@id='designation']")).sendKeys("haha");
	        driver.findElement(By.xpath("//input[@id='qualification']")).sendKeys("be");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	        driver.findElement(By.xpath("//input[@id='password_confirmation']")).sendKeys("123456");
	        
	}

}
