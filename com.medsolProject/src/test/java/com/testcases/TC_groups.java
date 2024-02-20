package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.GroupsTesting;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_groups {
	public static WebDriver driver;
	

	GroupsTesting gt = new GroupsTesting();

	@BeforeTest
	public void url_launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://medsolbuffer.in/login");
	}

	@AfterTest
	public void url_close() {
		driver.close();
	}

	@Test(groups = "smoke")
	public void groups_smoke() throws InterruptedException {
		gt.smokeTest();
	}

	@Test(groups = "func")
	public void groups_func() throws InterruptedException {
		gt.funcTest();
	}

}
