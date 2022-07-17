package com.test;

import javax.sql.RowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadFiles {
   public static void main(String[] args) {
	
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();   
	   
	   driver.manage().window().maximize();
	   
	   driver.navigate().to("https://www.monsterindia.com/");
	   
	   driver.findElement(By.xpath("//a[@title='Click to upload your resume' and @class='btn block resume-btn btn-orange mt20']")).click();
      
	                                                   //  using send keys
	   
	   driver.findElement(By.id("file-upload")).sendKeys("C:\\New folder\\om.txt");
	   
	   
	                                                    // using robt class methods
	   
	WebElement button=   driver.findElement(By.id("file-upload"));
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("arguments[0].click();", button);
	
	
	/*1.copy the path
	 * 2.ctrl+v
	 * 3.Enter
	 */
	
	
      
       
          ;
   }
}
