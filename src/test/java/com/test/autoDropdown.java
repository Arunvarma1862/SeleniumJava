package com.test;

import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoDropdown {
    
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Start-maximized");
		options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.twoplugs.com/");
		options.addArguments("disable-notifications");
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
	      WebElement serachBox=	driver.findElement(By.id("autocomplete"));
	      serachBox.clear();
	      serachBox.sendKeys("toronto");
	      String text;
	      
	      do {
	    	  serachBox.sendKeys(Keys.ARROW_DOWN);
	    	  text=  serachBox.getAttribute("value");
	    	  if(text.equals("Toronto, OH, USA"))
	    	  {
	    		  serachBox.sendKeys(Keys.ENTER);
	    		  break;
	    	  }
	    	  
	      }
	      while(!text.isEmpty());
	
	}
}
