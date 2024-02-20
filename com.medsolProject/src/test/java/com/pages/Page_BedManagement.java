package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page_BedManagement extends BaseTest {
	
	WebDriver driver;
	
	public Page_BedManagement(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	public void bedmngTest() throws InterruptedException
	{
		WebElement bedmng_module=driver.findElement(By.xpath(pr_loc.getProperty("bm_module")));
		Actions act=new Actions(driver);
		act.moveToElement(bedmng_module).click().build().perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(pr_loc.getProperty("bed_types"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(pr_loc.getProperty("new_bedtype"))).click();
		Thread.sleep(1000);
		driver.findElement(By.id(pr_loc.getProperty("bed_title"))).sendKeys(pr_data.getProperty("bed_title"));
		driver.findElement(By.id(pr_loc.getProperty("bed_descrip"))).sendKeys(pr_data.getProperty("bed_description"));
		Thread.sleep(1000);
		driver.findElement(By.id(pr_loc.getProperty("btsave_btn"))).click();
		//
		
		
		for(int x=0;x<=10;x++)
		{
			driver.findElement(By.xpath("//form[@id='addBloodDonorForm']//div[@class='row']")).click();
		}
		
		
		
	}

}
