package com.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascript {
	     static WebDriver driver;
	     
	     public static void main(String[] args) throws Exception 
	     {
	    		WebDriverManager.edgedriver().setup();
	    		EdgeOptions options = new EdgeOptions();
	    		options.addArguments("Start-maximized");
	    		driver = new EdgeDriver(options);
		        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 
		// driver.get("https://www.hyrtutorials.com/");
		   driver.get("https://github.com/login");
		   generateAlert(driver,"this is my alert");
         
	//	 JavascriptExecutor jse= (JavascriptExecutor) driver;
		 
		 
		 
		                                                  // find element 
		 
//		 WebElement element= (WebElement) jse.executeScript("return document.getElementsByClassName(\"inputtext _55r1 _6luy\")[0];");
//		 element.sendKeys("hiiiiii");
		 
	  /*  WebElement ele=	(WebElement) jse.executeScript("return document.getElementById('login_field');");
	      ele.sendKeys("abcde");*/	
		 
		 
		                                             //  enter text in to textbox
	       
		 
//		 jse.executeScript(" document.getElementById('login_field').value='abcd';");
//		 jse.executeScript("document.getElementById(\"email\").value='abcd';");
//		 Thread.sleep(2000);
		 
		 
		 
		                                             // perform click
		 
//		 jse.executeScript("document.getElementByid(\"login\").click();");
//		 
		 
		                                                 //highlight
		 
//		 jse.executeScript("document.getElementById('email').style.border=' 2px blue solid';");
//		 Thread.sleep(2000);
//		 jse.executeScript("document.getElementById('email').style.background='yellow'");
//		 Thread.sleep(2000);
//		 jse.executeScript("document.getElementById('email').setAttribute('style','border:5px red solid;background:blue;colour:white');");
//		 
		 
		                                            // scroll methods
		 
//		 jse.executeScript("window.scrollTo(0,500);");
//		 Thread.sleep(2000);
//		 jse.executeScript("window.scrollBy(0,500);");
//		 Thread.sleep(2000);
//		  jse.executeScript("document.getElementById('lower-wrapper').scrollIntoView();");
//		  screen();
		 
		                                              // arguments pass
//		
		/* WebElement login=driver.findElement(By.id("login_field"));
		 jse.executeScript("arguments[0].style.border='5px red solid'", login);
		 jse.executeScript("arguments[0].setAttribute('style','border:5px blue solid;background:yellow')", login);	
		 
		 WebElement username=driver.findElement(By.id("email"));
		 jse.executeScript("arguments[0].setAttribute('style','border:5px red solid');",username);
		 Thread.sleep(2000);
		 driver.close();*/
		 
		                            //  zoom out
//		jse.executeScript("document.body.style.zoom='50%';");
		
		
	
		
//		 
	}
//     public static void screen() throws IOException {
//    	 TakesScreenshot ts= (TakesScreenshot) driver;
//    	File source= ts.getScreenshotAs(OutputType.FILE);
//    	File destfile = new File("./screenshot/img.jpg");
//    	FileUtils.copyFile(source, destfile);
//    	
//    	
    	 
  //   }
            public static void generateAlert(WebDriver driver,String message)
            {
           	    JavascriptExecutor jse= (JavascriptExecutor) driver;
           	    
           	    
           	    
            	jse.executeScript("alert("+message+")");
            }
     
     
    }

