package com.Germany.BaseTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Germany.CommonUtility.Utility_Methods;

public class Base_Test {

	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility_Methods.getPropertyValue("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	

}
