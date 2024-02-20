package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Beds extends BaseTest{
	WebDriver driver;
	
	public Page_Beds(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void bedsTest() throws IOException, InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath(pr_loc.getProperty("beds"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("actions"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("new_bed"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("bed_name"))).sendKeys(pr_data.getProperty("bed_name"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("bed_typess"))).click();
		Thread.sleep(2000);
		WebElement ddown=driver.findElement(By.xpath(pr_loc.getProperty("bed_type_sbox")));
		ddown.sendKeys(pr_data.getProperty("bed_title"));
		ddown.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath(pr_loc.getProperty("bed_charges"))).sendKeys(pr_data.getProperty("charges"));
		driver.findElement(By.xpath(pr_loc.getProperty("bed_descri"))).sendKeys(pr_data.getProperty("bed_type_descrip"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr_loc.getProperty("bed_saveBtn"))).click();
		
	}

}
