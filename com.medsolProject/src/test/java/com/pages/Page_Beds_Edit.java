package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Beds_Edit extends BaseTest {
	WebDriver driver;

	public Page_Beds_Edit(WebDriver driver) {
		this.driver = driver;
	}
	
	public void bedsEditTest() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath(pr_loc.getProperty("edit_option2"))).click();
		Thread.sleep(1000);
		WebElement charge= driver.findElement(By.xpath(pr_loc.getProperty("edit_charges")));
		charge.clear();Thread.sleep(1000);
		charge.sendKeys(pr_data.getProperty("new_charges"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(pr_loc.getProperty("edit_save_btn2"))).click();
	}
	
	public void bedsdeleteTest() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr_loc.getProperty("delete_option2"))).click();
		Thread.sleep(2000);
	//	driver.switchTo().alert().accept();
		driver.findElement(By.xpath(pr_loc.getProperty("delete_ok"))).click();
	}

}
