package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*1.how many rows in table
 * 2.how many rows in table
 * 3.retrieve the specific row/column data
 * 4.retrieve all date from the table
 * 5.print release date, version of java language of selenium 
 * 
 */
public class StaticTable {
 public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.selenium.dev/ecosystem/");
    
                               // how many rows in table
    
   int rows= driver.findElements(By.xpath("(//table[@class='table'])[1]/tbody/tr")).size();
   System.out.println(rows);
   
   
                                //   how many column in table
   
  int colm= driver.findElements(By.xpath("(//table[@class='table'])[1]/thead/tr/th")).size();
  System.out.println(colm);
  
  
                                 //retrieve the specific row/column data
   String sr1= driver.findElement(By.xpath("(//table[@class='table'])[1]//tr[2]/th")).getText();
  System.out.println(sr1);
  
  
  String sr2= driver.findElement(By.xpath("((//table[@class='table'])[1]/tbody/tr/td)[5]")).getText();
  System.out.println(sr2);    //  (//table[@class='table'])[1]//tr[4]/td[2]
  
  
                                      // retrieve all date from the table
  
  


		 List<WebElement> table= driver.findElements(By.xpath("(//table[@class='table'])[1]/tbody/tr"));
		 
		 for (WebElement webElement : table) {
			 
		       String e= webElement.getText();
			  System.out.print("||"+e+"||");
		}
		         
		   System.out.println();
		  
		 
	  
         
 
  
 /* for(int r=1;r<=rows;r++) {
       String lang=driver.findElement(By.xpath("((//table[@class='table'])[1]//tbody//tr)["+r+"]")).getText();

if(lang.equals("wd")) 
{
	String lange=	driver.findElement(By.xpath("((//table[@class='table'])[1]//tbody//tr)["+r+"]/td")).getText();
	//String langd	=driver.findElement(By.xpath("(//table[@class='table'])[1]//th["+r+"]/following::td[4]/following::td[2]")).getText();
	
	System.out.println(lang+" "+lange);
}
	  }*/
		   
		   
		   for (int r = 1; r <=rows; r++) {
			
			   
			   for (int c = 1; c <=colm; c++) {
				   
				   String data=  driver.findElement(By.xpath("(//table[@class='table'])[1]//tr["+r+"]//td["+c+"]")).getText();
				   System.out.println(data);
			}
		}
       
         
      
      
  
  
  
 
  
  
 }
 
 
 }