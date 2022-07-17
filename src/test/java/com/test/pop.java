package com.test;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pop {
    public static void main(String[] args) throws Exception {
		
    	/*WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
    	options.addArguments("disable-notifications");
    	options.addArguments("disable-geolocation");
    	options.addArguments("disable-media-stream");
    	WebDriver driver = new ChromeDriver(options);
    	 driver.get("www.google.com");*/
    	
    	/*ask(default)-0
    	 allow        -1
    	 block        -2*/
    	
    	
    	
         HashMap<String, Integer>  contextSettings= new HashMap<String, Integer>();
         HashMap<String, Object>  profile= new HashMap<String, Object>();
         HashMap<String, Object>  prefs= new HashMap<String, Object>();
         ChromeOptions options = new ChromeOptions();
         
         contextSettings.put("notifications", 0);                
       /*contextSettings.put("geolocation", 1);               
         contextSettings.put("media-stream", 2);*/              
         profile.put("managed-default-contextSettings", contextSettings);
         prefs.put("profile", profile);
         options.setExperimentalOption("prefs", prefs);
        
         
         
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver(options);
         driver.manage().window().maximize();
         
         driver.get("https://www.cleartrip.com");
         driver.get("https://www.geolocation.com");
         
         
         driver.get("https://www.mictests.com");
         Thread.sleep(2000);
         driver.findElement(By.id("mic-launcher")).click();         
         
         
    }
    
}
