package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class screenshot
{
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver= new ChromeDriver();
		//RemoteWebDriver driver= new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		                            //file  type of capture screenshot
		//	
		//	File sourcefile =driver.getScreenshotAs(OutputType.FILE);
		//	File destfile = new  File("./screenshot/img1.jpg");
		//	FileUtils.copyFile(sourcefile, destfile);
		//	System.out.println("screenshot saved succesfully");
		//	driver.quit();


		//	                         //byte
		
		//	byte [] bytearr= driver.getScreenshotAs(OutputType.BYTES);
		//	File destfile = new File("./screenshot/img2.jpg");
		//	FileOutputStream fos = new FileOutputStream(destfile);
		//	fos.write(bytearr);
		//	fos.close();
		//	System.out.println("screenshot saves sucesfully");
		//	driver.quit();
		//	

		//	                           // base64
		
		//	String base64code =driver.getScreenshotAs(OutputType.BASE64);
		//	byte [] bytearr= Base64.getDecoder().decode(base64code);
		//	File destfile = new File("./screenshot/img3.jpg");
		//	FileOutputStream fos = new FileOutputStream(destfile);
		//	fos.write(bytearr);
		//	fos.close();
		//	System.out.println("screenshot saves succesfully");
		//	driver.quit();
		//	



		TakesScreenshot takescreenshot= (TakesScreenshot) driver;
		File sourcefile =takescreenshot.getScreenshotAs(OutputType.FILE);
		File destfile = new  File("./screenshot/img5.jpg");
		FileUtils.copyFile(sourcefile, destfile);
		System.out.println("screenshot saved succesfully");
		driver.quit();
	}
}
