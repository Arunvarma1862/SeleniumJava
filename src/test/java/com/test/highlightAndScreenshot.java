package com.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class highlightAndScreenshot
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriverManager.edgedriver().setup();
		EdgeOptions options= new EdgeOptions();
		options.addArguments("Start-maximized");
		driver = new EdgeDriver(options);

		//		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		         JavascriptExecutor jse= (JavascriptExecutor) driver;

		//		 driver.get("https://www.google.com/");
		//		 Thread.sleep(5000);
		//		 screen();
		//		 
		driver.get("https://demo.nopcommerce.com/desktops");

		jse.executeScript("document.getElementsByClassName('footer-upper')[0].scrollIntoView();");
		Thread.sleep(2000);
		screen();
	


		//		 
		//		 driver.findElement(By.name("q")).sendKeys("hello",Keys.ENTER);
		//		 jse.executeScript("window.scrollTo(0,500);");
		//		 screen();
		//		 
		//		 
		//		 driver.get("https://www.facebook.com/");
		//	     screen();
		//		 driver.navigate().back();
//	             driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		//	     screen();
		



		//		
		//		 highlight	( driver.findElement(By.id("email")));
		//		 Thread.sleep(2000);
		//	     highlight( driver.findElement(By.id("pass")));
		//	    
		//		 Thread.sleep(2000);
		//	      highlight(driver.findElement(By.xpath("//div[@class='_8esn']")));
		//	      screen();
		Thread.sleep(2000);
		driver.close();

	}
	public static void highlight(){
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style','border:5px red solid')");


	}
	public static void screen() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		//     WebElement logo= driver.findElement(By.xpath("//a[text()='Twitter']"));
		       File src =ts.getScreenshotAs(OutputType.FILE);
		//	   File dest= new File("./screenshot/img1234.jpg");
		//	   FileUtils.copyToDirectory(src, dest);
		//	   
		File dest= new File("./screenshot/img1354.jpg");
		FileUtils.copyFile(src, dest);
		//	  

	}
}
