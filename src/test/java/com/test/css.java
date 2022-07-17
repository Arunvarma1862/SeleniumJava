package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css {
   public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeOptions options = new EdgeOptions();
	options.addArguments("Start-maximized");
	WebDriver driver = new EdgeDriver(options);
	
	driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
	
	                   // css simple selector
	
//	System.out.println(driver.findElement(By.cssSelector("button")).getAttribute("id"));
//	driver.findElement(By.cssSelector("#firstName")).sendKeys("hello");
//	driver.findElement(By.cssSelector(".gender")).sendKeys("male");
//	System.out.println(driver.findElements(By.cssSelector("*")).size());
//	
	                    // css attribute selector
	
//    System.out.println(driver.findElements(By.cssSelector("input[placeholder]")).size());
//    System.out.println(driver.findElements(By.cssSelector("input[placeholder=\"First Name\"]")).size());
//    System.out.println(driver.findElements(By.cssSelector("input[placeholder~=\"question\"]")).size());
//    System.out.println(driver.findElements(By.cssSelector("input[placeholder*=\"que\"]")).size());
//    System.out.println(driver.findElements(By.cssSelector("p[class|=\"my\"]")).size());
//    System.out.println(driver.findElements(By.cssSelector("p[class^=\"my\"]")).size());
//    System.out.println(driver.findElements(By.cssSelector("p[class$=\"lass\"]")).size());
//    
    
	                     // css combinator selectors
//	
//	System.out.println(driver.findElements(By.cssSelector(".container select")).size());
//	System.out.println(driver.findElements(By.cssSelector(".container>div>select")).size());
//	System.out.println(driver.findElements(By.cssSelector("input[placeholder=\"Verify your personal details\"]+select")).size());
//	System.out.println(driver.findElements(By.cssSelector("input[placeholder=\"Verify your personal details\"]~input")).size());
//	
	
	                      //css conditions 
	
//	System.out.println(driver.findElements(By.cssSelector("input[class=\"name\"][id=\"firstName\"]")).size());
//	System.out.println(driver.findElements(By.cssSelector("input[placeholder=\"Last Name\"],input[name=\"lname\"]")).size());
//	System.out.println(driver.findElements(By.cssSelector("input.button:not([type=button])")).size());
//	
	                          // css pseudo classes
	System.out.println(driver.findElements(By.cssSelector(".container>:first-child")).size());
	System.out.println(driver.findElements(By.cssSelector(".container>:last-child")).size());
	System.out.println(driver.findElements(By.cssSelector(".container>:nth-child(2)")).size());
	System.out.println(driver.findElements(By.cssSelector(".container>a:first-of-type")).size());
	System.out.println(driver.findElements(By.cssSelector(".container>a:last-of-type")).size());
	System.out.println(driver.findElements(By.cssSelector(".container>input:nth-of-type(3)")).size());
	
	driver.quit();
	
}
}
