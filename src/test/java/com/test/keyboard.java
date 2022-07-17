package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboard {
   public static void main(String[] args) throws InterruptedException {
	   
	  WebDriverManager.edgedriver().setup();
	  EdgeOptions options = new EdgeOptions();
	  options.addArguments("Start-maximized");
	  WebDriver driver = new EdgeDriver(options);
	  
	  
	  driver.get("https://the-internet.herokuapp.com/key_presses");
//	  driver.get("https://text-compare.com/");
	  
	  // keyboard
	  
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  act.sendKeys(Keys.ESCAPE).perform();
	  Thread.sleep(2000);
	  act.sendKeys(Keys.BACK_SPACE).perform();
	  Thread.sleep(2000);
	  act.sendKeys(Keys.SPACE).perform();
	  Thread.sleep(2000);
	  driver.quit();
//	  
	  
	  // multiple keyboard
	  
	 

//	  
//	  WebElement input1=driver.findElement(By.id("inputText1"));
//	  WebElement input2=driver.findElement(By.id("inputText2"));
//	  
//	  input1.sendKeys("welcome to selenium");
//	  
////	  ctrl+A
//	  
//	  act.keyDown(Keys.CONTROL);
//	  act.sendKeys("a");
//	  act.keyUp(Keys.CONTROL);
//	  act.perform();
//	  
//	  // ctrl+c
//	  
//	  act.keyDown(Keys.CONTROL);
//	  act.sendKeys("c");
//	  act.keyUp(Keys.CONTROL);
//	  act.perform();
//	  
//	  // tab- shift to input2 box
//	  
//	  act.sendKeys(Keys.TAB);
//	  act.perform();
//	  
//	  
//	  // ctrl+v
//	  
//	  act.keyDown(Keys.CONTROL);
//	  act.sendKeys("v");
//	  act.keyUp(Keys.CONTROL);
//	  act.perform();
//	  
//	  if(input1.getAttribute("value").equals(input2.getAttribute("value"))){
//		  System.out.println("text copied");
//	  }
//	  else
//	  {
//		  System.out.println("not copied");
//	  }
	 
	  
}
}
