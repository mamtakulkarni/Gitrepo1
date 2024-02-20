package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_bmEdit extends BaseTest {

	WebDriver deiver;

	public Page_bmEdit(WebDriver deiver) {
		this.driver = driver;
	}

	public void editTest() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(pr_loc.getProperty("edit_option"))).click();
		driver.findElement(By.id(pr_loc.getProperty("edit_title"))).sendKeys(pr_data.getProperty("edit_data"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("edit_save_btn"))).click();
	}
	
	public void deleteTest() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr_loc.getProperty("delete_option"))).click();
		Thread.sleep(2000);
	//	driver.switchTo().alert().accept();
		driver.findElement(By.xpath(pr_loc.getProperty("delete_cancle"))).click();
	}
}
