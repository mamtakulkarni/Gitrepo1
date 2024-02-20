package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pages.BaseTest;

public class DatePicker extends BaseTest{
	
	public DatePicker(WebDriver driver)
	{
		this.driver=driver;
	}
	public void datePick() throws InterruptedException
	{
		driver.findElement(By.xpath(pr_loc.getProperty("dob_field"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("year_field"))).clear();
		driver.findElement(By.xpath(pr_loc.getProperty("year_field"))).sendKeys(pr_data.getProperty("year_value"));
		
				
		
		Thread.sleep(2000);
		WebElement mt= driver.findElement(By.xpath(pr_loc.getProperty("month_field")));
		Select slt=new Select(mt);
		slt.selectByVisibleText(pr_data.getProperty("month_value"));
		
		for(int x=0;x<=10;x++)
		{
			driver.findElement(By.xpath(""));
		}
		Thread.sleep(2000);
		List<WebElement> dates=driver.findElements(By.xpath(pr_loc.getProperty("date_field")));
		
		for(WebElement elem:dates)
		{
			
			String dt=elem.getText();
			if(dt.equals(pr_data.getProperty("date_value")))
			{
				elem.click();
				break;
			}
			
		}
		
	}

}
