package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class url {
       public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver  driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org");
		
		
		// url
//		
//		String currentUrl=driver.getCurrentUrl();
//		System.out.println("current url -"+ currentUrl);
//		
//		// title
//		
//		String title=driver.getTitle();
//		System.out.println("title -"+title);
		
		// page source
		String pagesource =driver.getPageSource();
		System.out.println("pagesource -"+ pagesource);
		
		driver.quit();
		
		// 
		
	}
}
