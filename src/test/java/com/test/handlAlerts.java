package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlAlerts {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		
		                                // alert box
		
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.xpath("//button[text()=\"Click me\" and @id=\"alertBox\"]")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[text()=\"You selected alert popup\"]")).getText());
		Thread.sleep(3000);
		driver.quit();

		
//		                               //confirm box
		
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[text()=\"Click me\"])[2]")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//div[text()=\"You pressed OK in confirmation popup\"]")).getText());
//		
//		driver.findElement(By.xpath("(//button[text()=\"Click me\"])[2]")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//div[text()=\"You pressed Cancel in confirmation popup\"]")).getText());
//		Thread.sleep(2000);
//		driver.quit();
		
		                               // prompt box
		
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[text()=\"Click me\"])[3]")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(2000);
//		driver.switchTo().alert().sendKeys("abcd");
//		Thread.sleep(8000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//div[text()=\"You entered text abcd in propmt popup\"]")).getText());
//		Thread.sleep(2000);
//		
//		
//		
//		driver.findElement(By.xpath("(//button[text()=\"Click me\"])[3]")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(2000);
//		
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//div[text()=\"You pressed Cancel in prompt popup.\"]")).getText());
		Thread.sleep(2000);
		driver.quit();

		
	}

}
