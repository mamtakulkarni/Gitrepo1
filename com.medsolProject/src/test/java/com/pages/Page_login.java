package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.testcases.TC_login;

public class Page_login extends BaseTest{
	
	public Page_login(WebDriver driver )
	{
		this.driver=driver;
	}
	
	
	public void loginTest() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.id(pr_loc.getProperty("user"))).sendKeys(pr.getProperty("username"));
		driver.findElement(By.id(pr_loc.getProperty("pass"))).sendKeys(pr.getProperty("password"));
		driver.findElement(By.xpath(pr_loc.getProperty("button"))).click();		
	}

}
//hhueujeueheh
