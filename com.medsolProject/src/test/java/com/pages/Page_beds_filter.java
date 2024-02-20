package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page_beds_filter extends BaseTest {
	WebDriver driver;

	public Page_beds_filter(WebDriver driver) {
		this.driver = driver;
	}

	public void FilterTest() throws InterruptedException {

		Thread.sleep(5000);
		WebElement flt = driver.findElement(By.xpath(pr_loc.getProperty("filter_option")));
		Actions act = new Actions(driver);
		act.moveToElement(flt).click().build().perform();

		
		Thread.sleep(2000);
		WebElement sts = driver.findElement(By.xpath(pr_loc.getProperty("filter_status")));
		sts.click();
		Thread.sleep(2000);



		driver.findElement(By.xpath(pr_loc.getProperty("not_avail"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pr_loc.getProperty("filter_status"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("avail"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pr_loc.getProperty("filter_status"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("all"))).click();
		Thread.sleep(4000);
		act.moveToElement(flt).click().perform();
		
//		sts.sendKeys(Keys.ARROW_DOWN);
//		sts.sendKeys(Keys.ARROW_DOWN);
//	
//		sts.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		// Available status 
//		sts.click();
//		Thread.sleep(2000);
//		sts.sendKeys(Keys.ARROW_DOWN);
//		sts.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		// All 
//		sts.click();
//		Thread.sleep(2000);
//		sts.sendKeys(Keys.ARROW_DOWN);
//		sts.sendKeys(Keys.ENTER);

	}

}
