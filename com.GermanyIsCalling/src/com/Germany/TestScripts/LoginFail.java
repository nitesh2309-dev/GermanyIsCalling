package com.Germany.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Germany.BaseTest.Base_Test;
import com.Germany.CommonUtility.Utility_Methods;

public class LoginFail extends Base_Test {

	@Test
	  public void loginfail() throws IOException {
		  
		  WebElement email = driver.findElement(By.xpath("(//input[contains(@ class , 'form')])[1]"));
		  email.click();
		  email.sendKeys("whoknowsw84@gmail.com");
		  WebElement password = driver.findElement(By.xpath("(//input[contains(@ class , 'form')])[2]"));
		  password.click();
		  password.sendKeys("peace@4200");
		  
		  driver.findElement(By.xpath("//button[contains(@ class , 'btn btn-dang')]")).click();
		  
		  
		  WebElement failure = driver.findElement(By.xpath("//li[contains (text() , 'Please enter')]"));
		  if(failure.isDisplayed()) {
				Utility_Methods.getScreenshot(driver);
			}
		  
	  }
}
