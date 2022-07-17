package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown {
	
    public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options= new ChromeOptions();
	options.addArguments("Start-maximized");
	options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
//	options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
	options.addArguments("disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.hdfcbank.com/");
	
    

    // product type
	  driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
      List<WebElement> elements= driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
      System.out.println(elements.size());
       selectDrop(elements,"Accounts");
  
      //product
	 
      driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
	  List<WebElement>ele= driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
	  System.out.println(ele.size());
	  selectDrop(ele,"Savings Accounts");
      driver.quit();
}
    public static void selectDrop(List<WebElement> eles,String value) {
    	
    	  for (WebElement Element : eles)
    	  {
    		  if(Element.getText().equals(value)) {
    			  Element.click();
    			  break;
    			  
    		  }
    		 
    }

    }
}
