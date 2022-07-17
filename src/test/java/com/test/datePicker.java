package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class datePicker {
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=red%20bus&utm_content=Brand&gclid=EAIaIQobChMI2bG62o_z9wIVTphmAh1pJw-DEAAYASAAEgINc_D_BwE");


		String year="2022";
		String month ="july";
		String date="2";

		driver.findElement(By.id("datepicker1")).click();  

		while(true)
		{

			String mon=	driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]")).getText();
			String ye=	driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])")).getText();
			/*String arr[]=	monthyear.split("  ");

	      String mon=arr[0];
	      String ye= arr[1];*/

			if(mon.equalsIgnoreCase(month) && ye.equals(year)) 
			{
				break;
			}
			else
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			
       }


		//date selection

		List<WebElement> allDates=	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));	

		for (WebElement webEle : allDates) 
		{
			String e= webEle.getText();
			if(e.equals(date))
			{
				webEle.click();
				break;


			}

		}

	}

}




	








