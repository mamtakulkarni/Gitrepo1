package com.pages;

import java.util.List;
import java.util.UUID;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utilities.DatePicker;

public class Page_accountants extends BaseTest {

	public Page_accountants(WebDriver driver) {
		this.driver = driver;
	}

	BaseTest base = new BaseTest();

	public void accountantTest() throws InterruptedException {
		WebElement acct = driver.findElement(By.xpath(pr_loc.getProperty("acc_module")));
		Actions act = new Actions(driver);
		act.moveToElement(acct).click().build().perform();

		driver.findElement(By.xpath(pr_loc.getProperty("action_btn"))).click();
		driver.findElement(By.id(pr_loc.getProperty("firstname"))).sendKeys(pr_data.getProperty("first_name"));
		driver.findElement(By.id(pr_loc.getProperty("lastname"))).sendKeys(pr_data.getProperty("last_name"));
		// driver.findElement(By.id(pr_loc.getProperty("email"))).sendKeys(pr_data.getProperty("email"));

		WebElement emailInput = driver.findElement(By.id(pr_loc.getProperty("email")));

		String dynamicEmail = pr_data.getProperty("first_name") + UUID.randomUUID().toString()+ pr_data.getProperty("email_e");
		emailInput.sendKeys(dynamicEmail);

		driver.findElement(By.id(pr_loc.getProperty("ph_no"))).sendKeys(pr_data.getProperty("ph_number"));
		driver.findElement(By.xpath(pr_loc.getProperty("bl_group"))).click();
		Thread.sleep(2000);
		WebElement blood = driver.findElement(By.xpath(pr_loc.getProperty("bl_sbox")));
		blood.sendKeys(pr_data.getProperty("bl_group"));
		blood.sendKeys(Keys.ENTER);
		driver.findElement(By.id(pr_loc.getProperty("desig"))).sendKeys(pr_data.getProperty("designation"));
		driver.findElement(By.id(pr_loc.getProperty("qualif"))).sendKeys(pr_data.getProperty("qualification"));

		driver.findElement(By.id(pr_loc.getProperty("a_pass"))).sendKeys(pr_data.getProperty("password"));
		driver.findElement(By.id(pr_loc.getProperty("a_pass_conf"))).sendKeys(pr_data.getProperty("conf_password"));
		Thread.sleep(3000);

		DatePicker date = new DatePicker(base.getdriver());
		date.datePick();
		Thread.sleep(2000);
		WebElement save_button=driver.findElement(By.xpath(pr_loc.getProperty("save_btn")));
		act.moveToElement(save_button).click().build().perform();
	}

}

//while(true)
//	{}

//		String year="2015";
//		String yea= driver.findElement(By.xpath("//input[@aria-label='Year']")).getText();
//		
//		
//		if(yea.equals(year))
//		{
//			break;
//		}
//		else
//		{
//			driver.findElement(By.xpath("//span[@class='flatpickr-prev-month']")).click();
//		}
//	}
//	
//	while(true)
//	{
//		String month="June";
//		String mon=driver.findElement(By.xpath("//select[@aria-label='Month']")).getText();
//		
//		if(mon.equals(month))
//		{
//			break;
//		}
//		else
//		{
//			driver.findElement(By.xpath("//span[@class='flatpickr-prev-month']")).click();
//		}
//	}
