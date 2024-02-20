package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseTest;
import com.pages.Page_accountants;
import com.pages.Page_login;

public class TC_accountants {
	
	BaseTest base=new BaseTest();
	
	@BeforeTest
	public void url_open() throws IOException
	{
		base.setup();
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException
	{
		Page_login log=new Page_login(base.getdriver());
		log.loginTest();
	}
	
	@Test(priority = 2)
	public void accountants() throws InterruptedException
	{
		Page_accountants acc=new Page_accountants(base.getdriver());
		acc.accountantTest();
	}
	
	@AfterTest
	public void url_close()
	{
		base.teardown();
	}
	
}
