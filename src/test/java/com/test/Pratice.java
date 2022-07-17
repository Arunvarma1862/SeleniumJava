package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pratice {
    public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
	    EdgeOptions options = new EdgeOptions();
	    options.addArguments("Start-Maximized");
	    options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
	    WebDriver driver = new EdgeDriver(options);
	    driver.get("https://www.google.co.in/");
	    driver.findElement(By.name("q")).sendKeys("stopwatch online",Keys.ENTER);
	    System.out.println(driver.findElement(By.className("act-tim-txt-cnt")).getText());
	     WebElement start=  driver.findElement(By.xpath("//span[text()='Start'][1]"));	
	    start.click();
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//span[text()='Stop'])[1]")).click();
	    System.out.println(driver.findElement(By.className("act-tim-txt-cnt")).getText());
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//g-button[text()='Reset'])[1]")).click(); 
	    Thread.sleep(2000);
	    driver.quit();
	    
    
    }
}
