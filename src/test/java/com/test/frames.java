package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("hello");             // main
		Thread.sleep(2000);
		
		
		
		driver.switchTo().frame("frm1");                                //frame1
		WebElement frame1=driver.findElement(By.id("course"));
		Select frameee= new Select(frame1);
		frameee.selectByValue("java");
		Thread.sleep(2000);
		
		
		driver.switchTo().defaultContent();                              // main 
		driver.findElement(By.id("name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("hiii");
		Thread.sleep(2000);
		
		
		driver.switchTo().frame("frm2");                                  // frame2
		driver.findElement(By.id("firstName")).sendKeys("KGF");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();                              // main
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("hit");
		
		driver.switchTo().frame("frm1");                                  // frame1
		Thread.sleep(2000);
		frameee.selectByValue("python");
		Thread.sleep(2000);
		
		
		                                                              
		driver.switchTo().defaultContent();                       // main
		driver.findElement(By.id("name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("super hit");
		Thread.sleep(2000);
		
		
		driver.quit();
	}

}
