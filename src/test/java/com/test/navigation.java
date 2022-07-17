package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation
{
	
	static ChromeDriver driver;
    public static void main(String[] args) throws Exception
    
    {
    	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.co.in/");
	
	
//	File sourcefile =driver.getScreenshotAs(OutputType.FILE);
//	File destfile = new  File("./screenshot/img11.jpg");
//	FileUtils.copyFile(sourcefile, destfile);
	
	driver.findElement(By.name("q")).sendKeys("hello");
	Thread.sleep(2000);
    
	
	driver.findElement(By.name("q")).submit();
//	File sourcefile2 =driver.getScreenshotAs(OutputType.FILE);
//	File destfile2 = new  File("./screenshot/img12.jpg");
//	FileUtils.copyFile(sourcefile2, destfile2);
	Thread.sleep(2000);

	
//	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
//	File sourcefile3 =driver.getScreenshotAs(OutputType.FILE);
//	File destfile3 = new  File("./screenshot/img13.jpg");
//	FileUtils.copyFile(sourcefile3, destfile3);
//	
	
//	screenshot(driver.findElement(By.xpath("(//input)[3]")).sendKeys("test@gmail.com"));
	Thread.sleep(2000);
	
	
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	
	driver.navigate().back();
	Thread.sleep(2000);

	
	driver.navigate().forward();
    Thread.sleep(2000);
    
    
    driver.quit();
 
	
}
  public static void screenshot(WebElement element) throws Exception 
  {
	
		File sourcefile =driver.getScreenshotAs(OutputType.FILE);
		File destfile = new  File("./screenshot/img1.jpg");
		FileUtils.copyFile(sourcefile, destfile);
}
}