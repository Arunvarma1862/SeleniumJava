package com.test;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestDropdown {
    public static void main(String[] args) throws Exception {
    	
    	WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("Start-maximized");
		options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
		WebDriver driver = new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
        List<WebElement> lists= driver.findElements(By.xpath("//li[@class='sbct']//div[@class='wM6W7d']//span")); 
	    System.out.println("size :"+ lists.size());
	    
	    for (WebElement webEle : lists) 
	    {
	    String e=webEle.getText();
	     if(e.contains(" download"))
	     {
	    	 
	    	 Thread.sleep(5000);
	    	 webEle.click();
	    	 break;
	     }
		}
    }
}
