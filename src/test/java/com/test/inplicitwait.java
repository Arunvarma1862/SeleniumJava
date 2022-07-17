package com.test;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class inplicitwait {
    public static void main(String[] args) throws Exception 
    {
    	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		driver.manage().window().setSize(new Dimension(800,800));
			
		
	    driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt2")).sendKeys("hello hi");
		Thread.sleep(2000);
		driver.quit();
		
	}
    
}
