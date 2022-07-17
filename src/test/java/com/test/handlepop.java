package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlepop {
    public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("Start-maximized");
		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.quit();
		
		}
		
	}

