package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleCalender {
	
    public static void main(String[] args) throws InterruptedException, Exception{
    	WebDriverManager.edgedriver().setup();
    	EdgeOptions options = new EdgeOptions();
    	options.addArguments("Start-maximized");
    	WebDriver driver = new EdgeDriver(options);
	
	    driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	
	                                                // first calender
	
	int day=29;
//	driver.findElement(By.id("first_date_picker")).click();
//	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::a["+day+"]")).click();
	
	
	                                              // second calender
	
//	driver.findElement(By.id("second_date_picker")).click();
//	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()="+day+"]")).click();
	
	
	
	
//	  driver.findElement(By.id("first_date_picker")).click();
//	  Selectdate(driver,"28/aug/2020");
  
	  driver.findElement(By.id("second_date_picker")).click();
	  Selectdate(driver,"28/aug/2024");
	  
	     Thread.sleep(2000);
		driver.quit();
	
	
}
    
    
       public static void Selectdate(WebDriver driver ,String date) throws Exception {
	   Calendar calender =  Calendar.getInstance(); 
		 
		 
	     try
	        {
	    	 SimpleDateFormat targetdateformat=new SimpleDateFormat("dd/MMM/yyyy");
	    	 targetdateformat.setLenient(false);
			 Date formattedTargetdate=	targetdateformat.parse(date);
			 calender.setTime(formattedTargetdate);
	        } 
	     
	        catch (Exception e) 
	        {
	 		
	    	 throw new Exception ("invalid date is provided,please check the input date");
	    	
	    	}
	         
			 int targetMonth= calender.get(Calendar.MONTH);
			 int targetyear= calender.get(Calendar.YEAR);
			 int targetday =  calender.get(Calendar.DAY_OF_MONTH);
			
			 
			 
			 //April 2022
			 String currentdate= driver.findElement(By.className("ui-datepicker-title")).getText();	
			 calender.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
			 int currentMonth= calender.get(Calendar.MONTH);
			 int currentyear= calender.get(Calendar.YEAR);
			 
			 while(currentMonth <targetMonth || currentyear < targetyear) {
				  driver.findElement(By.className("ui-datepicker-next")).click();
				  currentdate= driver.findElement(By.className("ui-datepicker-title")).getText();	
				  calender.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
				  currentMonth= calender.get(Calendar.MONTH);
				  currentyear= calender.get(Calendar.YEAR);
				 
			 }
			 
			 while(currentMonth >targetMonth || currentyear > targetyear) {
				 driver.findElement(By.xpath("//span[.='Prev']")).click();
				  currentdate= driver.findElement(By.className("ui-datepicker-title")).getText();	
				  calender.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
				  currentMonth= calender.get(Calendar.MONTH);
				  currentyear= calender.get(Calendar.YEAR);
				 
			 }
		
			 
			 if(currentMonth ==targetMonth || currentyear == targetyear)
				 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()="+targetday+"]")).click();			
			 else 
				 throw new Exception("unable to select the date because of current an target date mismatch");
			 
		
	   
   }
}
