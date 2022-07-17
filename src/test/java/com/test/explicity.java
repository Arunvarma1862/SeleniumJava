package com.test;

import java.time.Duration;
//import java.time.Duration;
import java.util.Set;
//import java.util.function.Function;

//import org.apache.commons.lang3.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicity
{
	public static void main(String[] args) throws Exception  
	{
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("Start-maximized");
		WebDriver driver = new EdgeDriver(options);
		
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    driver.get("https://testproject.io/");

		   String parentwindowhandle=driver.getWindowHandle();
		   driver.findElement(By.linkText("Login")).click();
	       Set<String> windowhandles= driver.getWindowHandles();
		   for (String windowhandle : windowhandles) 
		   {
			if(!windowhandle.equals(parentwindowhandle)) 
			{
				driver.switchTo().window(windowhandle);
				
				
				
				//	//		   Function<webdriver, boolean> f= new Function<webdriver, boolean>() {
				//				   @Override
				//				   public boolean apply(WebDriver username) {
				//					   return username.findElement(By.id("username")).isDisplayed();
				//				   }
				//			};
				//	   wait.until(f);
				//	   
				
				wait.until(d->d.findElement(By.id("username"))).isDisplayed();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).isDisplayed();
				driver.findElement(By.id("username")).sendKeys("hello");
				Thread.sleep(2000);
				driver.quit();
			}

		}
	}

}



