package com.techfirefly.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

	WebDriver driver;
	private By spotLight = By.xpath("//h4[text()='SPOTLIGHT']");

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
	public void test1() {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(spotLight));

		Assert.assertEquals(driver.getTitle(), "Tech Firefly | Illuminating Solutions Globally");
		System.out.println("test1 | finished successfully ------------------");

	}
	
	@Test
	public void test2() {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(spotLight));

		Assert.assertEquals(driver.getTitle(), "Tech Firefly | Illuminating Solutions Globally");
		System.out.println("test2 | finished successfully ------------------");
	}

}
