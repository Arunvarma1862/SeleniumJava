package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse {
	
    public static void main(String[] args) throws Exception {
		  WebDriverManager.edgedriver().setup();
		  EdgeOptions options = new EdgeOptions();
		  options.addArguments("Start-maximized");
		  WebDriver driver = new EdgeDriver(options);
		  
		      Actions action = new Actions(driver);
		  
//		      driver.get("https://demo.opencart.com/");
//		  
//		      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
////		  driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
////		  driver.findElement(By.id("btnLogin")).click();
////		  
//		  
//		     
//		    action
//		   .moveToElement(driver.findElement(By.xpath("//a[text()=\"Desktops\"]")))
//		   .moveToElement(driver.findElement(By.xpath("//a[text()=\"Show All Desktops\"]")))
//		   .click()
//		   .perform();
//		     
//		     driver.navigate().back();
//		     Thread.sleep(2000);
//		     
//		   
//		    driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("laptop");
//		    action.doubleClick(driver.findElement(By.xpath("//input[@name=\"search\"]"))).perform();
		//  action.doubleClick().perform();
		    
		    
		    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		    driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		    
		    action.contextClick(  driver.findElement(By.xpath("//span[text()=\"right click me\"]"))).perform();
		    driver.findElement(By.xpath("//span[text()=\"Edit\"]")).click();
		    System.out.println( driver.switchTo().alert().getText());
		    driver.switchTo().alert().accept();
//		   
//		   
			
	
		  Thread.sleep(2000);
		  driver.quit();
	}
}
