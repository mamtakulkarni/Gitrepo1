package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseTest;
import com.pages.Page_login;


public class TC_login extends BaseTest{
	  
	BaseTest base=new BaseTest();
	
	@BeforeTest
	public void url_launch() throws IOException
	{
		base.setup();
	}
	
	@Test (groups="smoke")
	public void loginTest() throws InterruptedException
	{
		Page_login log=new Page_login(base.getdriver());
		log.loginTest();
	}
	
	
//	@AfterTest
	public void url_close()
	{
		base.teardown();
	}

}
