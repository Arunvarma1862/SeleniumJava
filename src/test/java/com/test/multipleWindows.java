package com.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleWindows {
      public static void main(String[] args) throws Exception 
      {
    	  
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 
	                        	 // single window
//		 
//		 String parentwindowhandle =driver.getWindowHandle();
//		 System.out.println("parentwindow handle -"+ parentwindowhandle+driver.getTitle());
//		 driver.findElement(By.id("newWindowBtn")).click();
		 
//		 Set<String>windowhandles=driver.getWindowHandles();
//		 
//		 for(String windowhandle:windowhandles) 
//		 {
//			 if(!windowhandle.equals(parentwindowhandle)) 
//			 {
		 
//				 driver.switchTo().window(windowhandle);
//			     driver.manage().window().maximize();
//			     driver.findElement(By.id("firstName")).sendKeys("hello");
//			     Thread.sleep(2000);
//			     driver.findElement(By.id("firstName")).clear();
//			     Thread.sleep(2000);
//			     driver.close();
//			     
//			 }
//		
//			 System.out.println(windowhandle+driver.getTitle());
//		 }
//		 driver.switchTo().window(parentwindowhandle);
//	     driver.findElement(By.id("name")).sendKeys("helloo");
//		 Thread.sleep(2000);
//		 driver.quit();
		 
		                                 // single tab
//		 
		 String parentwindowtab = driver.getWindowHandle();
		 System.out.println("parentwindowtab -"+parentwindowtab+driver.getTitle());
		 driver.findElement(By.id("newTabBtn")).click();
		 
		 Set<String> windowtabs = driver.getWindowHandles();
		 for(String windowtab:windowtabs) 
		 {
			 if(!windowtab.equals(parentwindowtab)) 
			 {
				 driver.switchTo().window(windowtab);
				 System.out.println(driver.findElement(By.id("output")).getText());
				 driver.findElement(By.xpath("(//button[text()=\"Click me\"])[2]")).click();
				 Thread.sleep(2000);
				 System.out.println(driver.switchTo().alert().getText());
				 Thread.sleep(2000);
				 driver.switchTo().alert().accept();
				 Thread.sleep(2000);
				 System.out.println(driver.findElement(By.id("output")).getText());
	 		     driver.close();
			 }
			 
  //	 System.out.println(windowtab+driver.getTitle());
		 }
		 driver.switchTo().window(parentwindowtab);
		 driver.findElement(By.id("name")).sendKeys("hello ");
		 Thread.sleep(2000);
		 driver.quit();
	}
}
