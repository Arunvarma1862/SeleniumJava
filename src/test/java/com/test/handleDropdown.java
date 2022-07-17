package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleDropdown {
	
            public static void main(String[] args) throws InterruptedException 
            {
            	
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
			
			WebElement course=driver.findElement(By.id("course"));
			Select courseElement= new Select(course);
			
			List<WebElement> courseoption = courseElement.getOptions();
			for(WebElement option : courseoption ) 
			{
				System.out.println(option.getText());
			}
			Thread.sleep(3000);
			
			courseElement.selectByIndex(1);
			Thread.sleep(3000);
			
			courseElement.selectByValue("net");
			Thread.sleep(3000);
			
			courseElement.selectByVisibleText("Javascript");
			Thread.sleep(2000);
			
			String visiblefirst = courseElement.getFirstSelectedOption().getText();
			System.out.println("visible element "+ visiblefirst);
			Thread.sleep(2000);
			driver.quit();
			
			
//			
//			WebElement ideElement= driver.findElement(By.xpath("(//select)[4]"));
//			Select ideoptions = new Select(ideElement);
//			
//			List<WebElement>ide =ideoptions.getOptions();
//			for(WebElement ides:ide) 
//			{
//				System.out.println(ides.getText());
//			}
//			
//			ideoptions.selectByIndex(0);
//			Thread.sleep(2000);
//			
//			ideoptions.selectByValue("ij");
//			Thread.sleep(2000);
//			
//			ideoptions.selectByVisibleText("NetBeans");
//			Thread.sleep(2000);
//			
//			
//			ideoptions.deselectByVisibleText("IntelliJ IDEA");
//			Thread.sleep(2000);
//			
//			List<WebElement> all=ideoptions.getAllSelectedOptions();
//			for(WebElement alls:all) 
//			{
//				System.out.println("visible selected -"+alls.getText());
			
//			if(alls.gettext().equals("NetBeans")) 
//			{
//				alls.click();
//				break;
//			}
//			}
//			Thread.sleep(2000);
//			driver.quit();
		
		}
}
