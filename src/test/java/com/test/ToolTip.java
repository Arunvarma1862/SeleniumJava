package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {
     public static void main(String[] args) {
		
    	 WebDriverManager.chromedriver().setup();
    	 WebDriver driver = new ChromeDriver();
    	 
    	 
    	                        // 1.  how to capture tooltip of the webelement?
    	 
    	 /*driver.get("https://jqueryui.com/tooltip/");
    	 
    	 driver.switchTo().frame(0);

  	     WebElement text=  driver.findElement(By.id("age"));
  	     
  	     String tooltiptext=   text.getAttribute("title");
  	     System.out.println(tooltiptext);*/
  	     
  	     
  	                                  //2. how to open link in new tab
    	 
    	/* driver.get("https://demo.nopcommerce.com/");
    	 String tab= Keys.chord(Keys.CONTROL,Keys.RETURN);
    	  driver.findElement(By.linkText("Register")).sendKeys(tab);*/
         
         
         
                          //  3. how to open url's in a multiple tabs and windows?
         
         
    	
    	/* driver.get("https://demo.nopcommerce.com/"); 
    	// driver.switchTo().newWindow(WindowType.TAB);
    	 driver.switchTo().newWindow(WindowType.WINDOW);
    	 driver.get("https://www.opencart.com/");*/ 
    	 
    	 
    	                         // how to capture size & location of the webElement?
    	 
    	 driver.get("https://opensource-demo.orangehrmlive.com/");
           WebElement logo= driver.findElement(By.xpath("//div[@id='divLogo']//img")); 
           
           // loaction  (method-1)
         System.out.println("location(x,y) "+logo.getLocation());
         System.out.println("location(x) "+logo.getLocation().getX());
         System.out.println("location(y) "+logo.getLocation().getY());
         
         
         // loaction  (method-2)
         System.out.println(logo.getRect());
         System.out.println("location(x) "+logo.getRect().getX());
         System.out.println("location(y) "+logo.getRect().getY());
         
         //size (method-1)
         
         System.out.println("size(width,height) "+logo.getSize());
         System.out.println("size(height) "+logo.getSize().getHeight());
         System.out.println("size(Width)  "+logo.getSize().getWidth());
         
         //size (method-2)
         System.out.println("size(height)  "+logo.getRect().getDimension().getHeight()); 
         System.out.println("size(Width)  "+logo.getRect().getDimension().getWidth()); 
         
         driver.quit();
	}
}
