package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDropdown {
     public static void main(String[] args) {
		
    		WebDriverManager.chromedriver().setup();
    		WebDriver driver = new ChromeDriver();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("https://bookonwardticket.com/dummy-ticket/?gclid=EAIaIQobChMImYut-NLz9wIVjK6WCh21VwSJEAAYASAAEgIWAPD_BwE");
            driver.findElement(By.id("dummy-departure-date")).click();
       
      WebElement mon= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
      
      Select month= new Select(  mon  );
      month.selectByVisibleText("Aug");
      
      Select year= new Select(driver.findElement(By.xpath("//select[@class ='ui-datepicker-year']")));
      year.selectByVisibleText("2022");
      
      
      String date="25";
      
      
     List<WebElement> dates=   driver.findElements(By.xpath("//table//td"));    
    for (WebElement webEle : dates) 
    {
      String dat= webEle.getText();
      
      if(dat.equals(date))
     {
    	  webEle.click();
    	  break;
    	  
      }
	
}

	}
}
