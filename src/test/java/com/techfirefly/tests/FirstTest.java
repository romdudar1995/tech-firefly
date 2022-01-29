package com.techfirefly.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techfirefly.com/");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void test() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}

		Assert.assertEquals(driver.getTitle(), "Tech Firefly | Illuminating Solutions Globally");

	}

}
