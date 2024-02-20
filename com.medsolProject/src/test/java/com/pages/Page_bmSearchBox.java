package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Page_bmSearchBox extends BaseTest {
	WebDriver driver;

	public Page_bmSearchBox(WebDriver driver) {
		this.driver = driver;
	}

	public void searchTest() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(pr_loc.getProperty("search_box"))).sendKeys(pr_data.getProperty("bed_title"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr_loc.getProperty("search_box"))).clear();
		
	}

}
