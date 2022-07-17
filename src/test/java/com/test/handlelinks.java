package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlelinks {
     public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://www.amazon.in/");
	     
	     
	     
	                                 //link
	     
	     
	 //    driver.findElement(By.linkText("Today's Deals")).click();  
	     
	     
	                              //partiallink
	     
     //     driver.findElement(By.partialLinkText("Deals")).click();  
	     
	     
	     
	     
	                           // capture all links
	     
	     
        /* List<WebElement> lin=driver.findElements(By.tagName("a"));
         System.out.println(lin.size());*/
         
         
         /*for (int i = 0; i <lin.size(); i++) {
        	 System.out.println(lin.get(i).getText());
        	 System.out.println(lin.get(i).getAttribute("href")	);
        	 }*/
	     
         
         /*for (WebElement webEle : lin) {
        	 System.out.println(webEle.getText());
        	 System.out.println(webEle.getAttribute("href")	);
		}*/
	     
	     driver.quit();
	     }
}
