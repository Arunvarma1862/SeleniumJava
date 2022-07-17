package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleDropdown 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/open-source/demo/");




		WebElement country=	driver.findElement(By.id("Form_submitRequest_Country"));
		selectdrop(country,"Afghanistan");
		
		WebElement industry=driver.findElement(By.id("Form_submitRequest_Industry"));
		selectdrop(industry,"Electronics");
		
		WebElement emp=	driver.findElement(By.id("Form_submitRequest_No_of_Employees"));
		selectdrop(emp,"16 - 20");
		
	}
	
	public static void selectdrop(WebElement ele,String value)
	
	{

		Select option = new Select(ele);
		List<WebElement> op= option.getOptions();
		for (WebElement ops : op)
		{
			if(ops.getText().equals(value)) 
			{
				ops.click();
				break;

			}

		}

	}
}
