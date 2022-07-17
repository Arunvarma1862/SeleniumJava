package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class date {
    public static void main(String[] args) throws Exception {
		
    	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		
		int i=0;       
		
		if(i==1) {                                  // future  date   
			
			while(!driver.findElement(By.className("ui-datepicker-title")).getText().contains("July 2022")) 
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		else                                        // past date
			
			while(!driver.findElement(By.className("ui-datepicker-title")).getText().contains("April 2021")) 
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
		
	
     List<WebElement> dates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[not(contains(@class,'ui-datepicker-other-month'))]")); 

      for (WebElement web : dates) 
      {
    	String text=   web.getText();
	    if(text.equalsIgnoreCase("25"))
	    {
		web.click();
	    break;	
	    }
      }
      
      Thread.sleep(2000);
      driver.quit();
      }
}
