package com.test;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadingpdf {
     public static void main(String[] args) {
    	 
    	 
    	 String location="C:\\eclipse project\\seleniumJavaMaven\\Downloads";
    	 
    	 
    	 //chrome
    	 
    	 HashMap<String,Object>preferences = new HashMap<>();
    	 preferences.put("plugins.always_open_pdf_externally", true);
    	 preferences.put("download.default_directory", location);
    	 
    	 ChromeOptions options = new ChromeOptions();
    	 options.setExperimentalOption("prefs", preferences);	
    	 
    	 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver(options);
         
         
         //Edge
         
       /*  HashMap preferences = new HashMap();
        *  preferences.put("plugins.always_open_pdf_externally", true);
    	   preferences.put("download.default_directory", location);
    	 
    	 EdgeOptions options = new EdgeOptions();
    	 options.setExperimentalOption("prefs", preferences);		
    	 
    	 WebDriverManager.edgedriver().setup();
         WebDriver driver = new EdgeDriver(options);*/
         
         
         
    	 // firefox
    	 
      /* FirefoxProfile profile= new FirefoxProfile();
       *  profile.setPreference("pdfjs.disabled", true);
       profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
       profile.setPreference("browser.download.folderList", 2);  // 0-desktop 1- downloads 2- desired location
       profile.setPreference("browser.download.dir", location);
       
       
    	 FirefoxOptions options = new FirefoxOptions();
    	 options.setProfile(profile);
    	 
    	 WebDriverManager.firefoxdriver().setup();
         WebDriver driver = new FirefoxDriver(options);*/
    	 
    	 
       
         
         driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
           driver.manage().window().maximize();
         driver.findElement(By.xpath("(//a[text()='Download sample pdf file'])[1]")).click();
    	 
     
     }
}
