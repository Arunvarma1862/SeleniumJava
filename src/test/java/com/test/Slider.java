package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Slider {
  public static void main(String[] args) {
	
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.jqueryscript.net/demo/price-range-slider-jquery-UI/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//span[1]"));
  }
}
