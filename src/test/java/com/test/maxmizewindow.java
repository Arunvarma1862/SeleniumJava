package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maxmizewindow {
  public static void main(String[] args) {
//	WebDriverManager.edgedriver().setup();
//	WebDriver driver = new EdgeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.google.co.in/?gws_rd=ssl");
//	
//	
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("Start-maximized");
//		WebDriver driver = new ChromeDriver(options);
//	    driver.get("https://www.google.co.in/?gws_rd=ssl");
//		
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("Start-maximized");
		WebDriver driver = new EdgeDriver(options);
	    driver.get("https://www.google.co.in/?gws_rd=ssl");
		
	
}
}
