package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getWebElementValue {
	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("Start-maximized");
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://github.com/session");
		
	                                          // tagname
		
		System.out.println(driver.findElement(By.name("commit")).getTagName());

		                                  // get attribute value	

		System.out.println( driver.findElement(By.name("commit")).getAttribute("type"));
		

		                                      //enter text value get
		WebElement username= driver.findElement(By.xpath("//input [@id=\"login_field\"]"));
		username.sendKeys("hello");
		System.out.println(username.getAttribute("value"));   


                                           // label text

		System.out.println(driver.findElement(By.xpath("//label[normalize-space(text())=\"Username or email address\"]")).getText());

                                          // get after signin text
		
		driver.findElement(By.xpath("(//input[@value=\"Sign in\"])[1]")).click();
		System.out.println(  driver.findElement(By.xpath("//div[@class=\"px-2\"]")).getText());
		
		
                                             // css value
		System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));

		driver.quit();
	}
}
