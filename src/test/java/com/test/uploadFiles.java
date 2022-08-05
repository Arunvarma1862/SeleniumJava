package com.test;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import  java.awt.Robot;
import  java.awt.datatransfer.StringSelection;
import  java.awt.Toolkit;
import  java.awt.event.KeyEvent;
import java.time.Duration;

public class uploadFiles {
   public static void main(String[] args) throws Exception {
	
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();   
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));  
	   driver.navigate().to("https://www.monsterindia.com/");
	   
	   driver.findElement(By.xpath("//a[@title='Click to upload your resume' and @class='btn block resume-btn btn-orange mt20']")).click();
      
	   
	 	                                                   //  using send keys
	   
	   //  driver.findElement(By.id("file-upload")).sendKeys("C:\\New folder\\om.txt");*/  
	   //  if type=File attribute present use send keys
	   
	   
	                                                    // using robot class methods
	   
	WebElement button = driver.findElement(By.id("file-upload"));
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("arguments[0].click();", button);
	
	
	/*1.copy the path
	 * 2.ctrl+v
	 * 3.Enter
	 */
	
	Robot rb = new Robot();
	rb.delay(2000);
	
	//put path to file in a clipboard
	
	StringSelection ss = new StringSelection("C:\\New folder\\om.txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	
	//Ctrl+v
	
	rb.keyPress(KeyEvent.VK_CONTROL); // press on CRTL key
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2000);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	rb.delay(2000);
	
	// Enter
	
	rb.keyPress(KeyEvent.VK_ENTER); // press Enter
	rb.keyRelease(KeyEvent.VK_ENTER);
    
	
          
   }
}
