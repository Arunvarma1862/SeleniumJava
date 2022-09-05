package com.test;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
  public static void main(String[] args) throws Exception {
	  
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("Start-maximized");
	options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://opensource-demo.orangehrmlive.com/");

	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();	
	
	 Actions action = new Actions(driver);
	 action
	.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")))
	.click().perform();
	action
	.moveToElement(driver.findElement(By.xpath("//li[@class='selected']")))
	.click().perform();
	
	
	                                     // select specific check box
    
	
	//driver.findElement(By.id("ohrmList_chkSelectRecord_29")).click();
	
	
	                                      // select all checkboxes
	
	List<WebElement> totalCheckBox=	driver.findElements(By.xpath("//input[@name='chkSelectRow[]']"));
	
	/*System.out.println(totalCheckBox.size());
	 * 
	for(int i=0;i<totalCheckBox.size();i++) {
		
		totalCheckBox.get(i).click();
		}
	
	for (WebElement webElement : totalCheckBox) {
		webElement.click();
		}*/
	
	                                       // multiple checkbox choice 
	
	/*for (WebElement Element : totalCheckBox) {
		String checkBox=Element.getAttribute("id");
		
		if(checkBox.equals("ohrmList_chkSelectRecord_29")  || checkBox.equals("ohrmList_chkSelectRecord_42")) {
			Element.click();
			}
	}*/
	
	
	                                              // select last 2 checkbox
	
	/*int listcheckbox=totalCheckBox.size();	
	
	for(int i=listcheckbox-2;i<listcheckbox;i++) {
		
		totalCheckBox.get(i).click();
		}*/
	
	
	
	                                                   // select first 2 boxes
	
	int listcheckbox=totalCheckBox.size();	
	
	for(int i=0;i<listcheckbox;i++) {
		if(i<2)
		{
			totalCheckBox.get(i).click();
			
		}
	}
	Thread.sleep(2000);
	driver.quit();
	
  }
}
