package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class muliplewin {
    public static void main(String[] args) throws Exception {
    	
		WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	   String win= driver.getWindowHandle();
	   System.out.println(win+driver.getTitle());
	    
	   
       driver.findElement(By.xpath("(//a[normalize-space(text()='OrangeHRM, Inc')])[2]")).click();
	   Set<String>wins= driver.getWindowHandles();
	   
	   for (String strin : wins)
	   {
		   if(!strin.equals(win))
		   {
			   driver.switchTo().window(strin);
		       driver.manage().window().maximize();
		       driver.findElement(By.xpath("//input[@id=\"myText\"]")).sendKeys("hello");
		       
		       Thread.sleep(2000);
		       driver.findElement(By.id("myText")).clear();
		       Thread.sleep(2000);
		       driver.close();
		  
		       
	}
	 //  System.out.println(driver.getTitle()); 
	     
    }
    driver.switchTo().window(win);
    driver.quit();
}
}