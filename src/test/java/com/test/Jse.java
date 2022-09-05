package com.test;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Jse {
	
     static WebDriver driver;
	 public static void main(String[] args) throws Exception {
		 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
        driver.get("https://github.com/login");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement element   =   driver.findElement(By.id("login_field"));
        element.sendKeys("hello");
        Thread.sleep(2000);
        highlight(element);
        WebElement element2   =     driver.findElement(By.id("password"));
        element2.sendKeys("hello");
        Thread.sleep(2000);
        highlight(element2);
       /* WebElement element   =   (WebElement) jse.executeScript(" return document.getElementById('login_field');");
        
        element.sendKeys("hello");*/
        
	}
    public static void highlight(WebElement element) {
    	
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
    	jse.executeScript("arguments[0].setAttribute('style','border:5px red solid; background:yellow')",element);
    	
    }
}
