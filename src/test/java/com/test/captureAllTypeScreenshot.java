package com.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class captureAllTypeScreenshot {
	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("Start-maximized");
		WebDriver driver= new EdgeDriver(options);

		driver.get("https://demo.nopcommerce.com/desktops");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

		//    	                             // screenshot full page

		//       TakesScreenshot ts = (TakesScreenshot) driver;
		//       File src= ts.getScreenshotAs(OutputType.FILE);
		//       File  dest= new File("./screenshot/img251.jpg");
		//       FileUtils.copyFile(src, dest);


	                                    	// section of webpage 
 
		//          WebElement section=driver.findElement(By.xpath("//div[@class=\"item-grid\"]"));
		//          File src= section.getScreenshotAs(OutputType.FILE);
		//          FileUtils.copyFile(src, new File("./screenshot/img25.jpg"));
		//      //  File  dest= new File("./screenshot/img252.jpg");
		//          FileUtils.copyFile(src, dest);

		//    	

	                                    	//  element of webpage

		//    	    WebElement section=driver.findElement(By.xpath("//img[@title=\"nopCommerce\"]"));
		//          File src= section.getScreenshotAs(OutputType.FILE);
		//          File  dest= new File("./screenshot/img253.jpg");
		//          FileUtils.copyFile(src, dest);

	                                         //  logo of webpage
	
		WebElement logo= driver.findElement(By.xpath("//a[text()='Twitter']"));
		wait.until(ExpectedConditions.visibilityOf(logo));
		File src =logo.getScreenshotAs(OutputType.FILE);
        File dest= new File("./screenshot/img13254.jpg");
		FileUtils.copyFile(src, dest);
		//  	  
		driver.quit();
	}
}
