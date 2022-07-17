package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkdrop {
    public static void main(String[] args) {
    	
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("Start-maximized");
		options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automatiom"));
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
           	    WebElement drplist=	driver.findElement(By.name("category_id"));	
	            Select sec= new Select(drplist);
	
	            List<WebElement>ele=  sec.getOptions();
	            
	            
	            ArrayList originalList= new ArrayList();
	            ArrayList templist= new ArrayList();
	
	            for (WebElement eles : ele)
	            {
	            	
	            	 originalList.add(eles.getText());
                     templist.add(eles.getText());		
			    }
	            
	            System.out.println("originallist "+originalList.toString());
	            System.out.println("templist "+templist); 
	            
	            
	            Collections.sort(templist);
	            
	            System.out.println("originallist "+originalList);
	            System.out.println("templist "+templist);
	            
	            if(originalList.equals(templist)) {
	            	System.out.println("dropdown sorted");
	            	
	            }
	            else {
	            	System.out.println("dropdown not sorted");
	            }
	            }
    
}
