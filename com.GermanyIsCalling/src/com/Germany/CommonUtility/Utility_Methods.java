package com.Germany.CommonUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility_Methods {
	
	//Method to take the ScreenshotOfWebPage
		public static void getScreenshot(WebDriver driver) throws IOException {
			
			Date currentdate = new Date();
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshots_Germany/"+currentdate+".jpg");
			FileHandler.copy(src, dest);
		}
		
		//Method to take the ScreenshotOfWebElement
		public static void getScreenshotElement(WebElement element ) throws IOException {
				
			Date currentdate = new Date();
				
			File src =element.getScreenshotAs(OutputType.FILE);	
			File dest = new File("./Screenshots_Germany/"+currentdate+".jpg");
			FileHandler.copy(src, dest);
				
			}
		
	    //Method to fetch data from properties File
		public static String getPropertyValue(String Key) throws IOException {
			
			FileInputStream fis = new FileInputStream("./testdata_Germany/commondata_Germany.properties");
			Properties prop = new Properties();
			prop.load(fis);
			return prop.getProperty(Key);
		}

}
