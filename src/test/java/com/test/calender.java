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

public class calender {
public static void main(String[] args) throws Exception {
	WebDriverManager.edgedriver().setup();
	EdgeOptions options = new EdgeOptions();
	options.addArguments("Start-maximized");
	WebDriver driver = new EdgeDriver(options);
	
	driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	
	
	                                       // first calender
	
//	int day=25;
//	driver.findElement(By.id("first_date_picker")).click();
//	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::a["+day+"]")).click();
	
	                                      //second calender
	
//	driver.findElement(By.id("second_date_picker")).click();
//	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]//a[text()="+day+"]")).click();
	
	                                         // third calender
//    int targetday=25;
//    driver.findElement(By.id("third_date_picker")).click();
//	WebElement element= driver.findElement(By.className("ui-datepicker-month"));
//	Select sec= new Select(element);
//	sec.selectByIndex(1);
//	WebElement element1=driver.findElement(By.className("ui-datepicker-year"));
//	Select sec1= new Select(element1);
//	sec1.selectByVisibleText("2016");
//	driver.findElement(By.xpath("(//a[@class='ui-state-default'])["+targetday+"]")).click();
//	
	                                  // fouth calender
//	     int targetday=22;
//	    driver.findElement(By.id("fourth_date_picker")).click();
//		WebElement element= driver.findElement(By.className("ui-datepicker-month"));
//		Select sec= new Select(element);
//		sec.selectByValue("1");
//		WebElement element1=driver.findElement(By.className("ui-datepicker-year"));
//		Select sec1= new Select(element1);
//		sec1.selectByVisibleText("2020");
//		driver.findElement(By.xpath("(//div[@id='ui-datepicker-div']//td[not(contains(@class,'ui-datepicker-other-month'))])["+targetday+"]")).click();
//		
	                                    //   fifth calender
//		int day=25;
//		driver.findElement(By.id("fifth_date_picker")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-unselectable'))]//a[text()="+day+"]")).click();
//	
		                                 // sixth calender
//		int day=23;
//		driver.findElement(By.id("sixth_date_picker"));
//		driver.findElement(By.className("ui-datepicker-trigger")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()="+day+"]")).click();
	
	
	
      Calendar  cal= Calendar.getInstance();
      String targetdate="12/aug/2019";
      
      
	try {
		
		SimpleDateFormat targetdateformat= new SimpleDateFormat("dd/MMM/yyyy");
	    targetdateformat.setLenient(false);
	    Date formatdate = targetdateformat.parse(targetdate);
	    cal.setTime(formatdate);
	    
	} catch (ParseException e) {
		
		throw new Exception ("invalid date is provided,please check the input date");
	}
     int targetmonth= cal.get(cal.MONTH);
     int targetyear= cal.get(cal.YEAR);
     int targetday= cal.get(cal.DAY_OF_MONTH); 
     driver.findElement(By.id("second_date_picker")).click();
     
     // april 2022
     
    
     String currentdate= driver.findElement(By.className("ui-datepicker-title")).getText();
 	 cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
 	 int currentmonth=cal.get(cal.MONTH);
 	 int currentyear=cal.get(cal.YEAR);
 	 
 	
 	 
 	 while(currentmonth > targetmonth || currentyear >targetyear) {
 		   
 		//   driver.findElement(By.className("ui-datepicker-next")).click();
 		  driver.findElement(By.xpath("//span[.='Prev']")).click();
 	       currentdate= driver.findElement(By.className("ui-datepicker-title")).getText();
 	 	   cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
 	 	   currentmonth=cal.get(cal.MONTH);
 	 	   currentyear=cal.get(cal.YEAR);
 	 }
 	 if(currentmonth == targetmonth || currentyear ==targetyear) {
 		 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()="+targetday+"]")).click();
 	 }
 	 else {
 		 throw new Exception("unable to select the date because of current an target date mismatch");
 	 }
 		 
}
}
