package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {
     public static void main(String[] args) {
		
    	 WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        
        
                                     // how many rows in table
        
      int  rows= driver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
      System.out.println(rows);
  
                                        // how many columns in table
  
      int  colm= driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
     System.out.println(colm);
     
 
                                  //retrieve the specific row/column data
     
    String textrow=   driver.findElement(By.xpath("//table[@id='customers']//tr[5]/td[1]")).getText();  
    System.out.println(textrow);
    
    String textcolm=   driver.findElement(By.xpath("//table[@id='customers']//tr[6]/td[3]")).getText();  
    System.out.println(textcolm);
     
    
                                        // retrieve all date from the table
    
    
    for (int r = 2; r <=rows; r++) {
    	
    	for (int c = 1; c <=colm; c++) {
    		 String text=   driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
    		 System.out.print("||"+text+"||");
		}
    	System.out.println();
		
	}
    
    
                               // print release date, version of java language of selenium 
    
    for (int r = 2; r <=rows; r++) {
    	
    	 String name=   driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[1]")).getText();
    	if(name.equals("Island Trading")) {
    		String con=   driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[2]")).getText();
    		String com=   driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[3]")).getText();
    		System.out.println(name+"-> "+con+"-> "+com);
    	}
		
	}
     
     
  //   driver.quit();
     
     }
}
