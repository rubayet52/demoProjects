package com.AutomationTalks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoProjects {

	public static WebDriver driver;
	@BeforeMethod
	public void launchDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test
	public void test1() {
		driver.navigate().to("http://google.com");
		System.out.println("Test 1 : " + driver.getTitle());
	
	}

	@Test
	public void test2() {
		driver.navigate().to("http://google.com");
		System.out.println("Test 2 : " + driver.getTitle());

	}

	@Test
	public void test3() {
		driver.navigate().to("http://google.com");
		System.out.println("Test 3 : " + driver.getTitle());

	}

	@AfterMethod
	public void quit() {
		if (driver != null) {
			driver.quit();
		}
	}
}
