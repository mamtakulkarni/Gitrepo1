package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseTest;
import com.pages.Page_BedManagement;
import com.pages.Page_Beds;
import com.pages.Page_Beds_Edit;
import com.pages.Page_beds_filter;
import com.pages.Page_bmEdit;
import com.pages.Page_bmSearchBox;

import com.pages.Page_login;

public class TC_bedManagement {
	
	BaseTest base=new BaseTest();
	
	@BeforeTest
	public void url_launch() throws IOException
	{
		base.setup();
	}
	
	@Test(priority = 1,groups="smoke")
	public void login() throws InterruptedException
	{
		Page_login log=new Page_login(base.getdriver());
		log.loginTest();
		System.out.println("smoke test is done");
	}
	
	@Test(priority = 2)
	public void bedManagement() throws InterruptedException
	{
		Page_BedManagement bed=new Page_BedManagement(base.getdriver());
		bed.bedmngTest();
	}
	
	//@Test(priority = 3)
	public void searchBox() throws InterruptedException
	{
		Page_bmSearchBox search=new Page_bmSearchBox(base.getdriver());
		search.searchTest();
	}
	@Test(priority = 4)
	public void edit() throws InterruptedException
	{
		Page_bmEdit edi=new Page_bmEdit(base.getdriver());
		edi.editTest();
		
		edi.deleteTest();
	}
	@Test(priority = 5)
	public void beds() throws IOException, InterruptedException
	{
		Page_Beds beds=new Page_Beds(base.getdriver());
		beds.bedsTest();
	}
	

	@Test(priority = 6)
	public void filter() throws InterruptedException
	{
		Page_beds_filter flt=new Page_beds_filter(base.getdriver());
		flt.FilterTest();
	}	
	
	@Test(priority = 7)
	public void bedEdit() throws InterruptedException
	{
		Page_Beds_Edit bEdit=new Page_Beds_Edit(base.getdriver());
		bEdit.bedsEditTest();
		bEdit.bedsdeleteTest();
	}
	
	
	@AfterTest
	public void url_close()
	{
		base.teardown();
	}

}
