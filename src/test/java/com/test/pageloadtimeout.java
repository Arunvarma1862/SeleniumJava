package com.test;

import java.time.Duration;
import java.time.Instant;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class pageloadtimeout
{
        public static void main(String[] args)
        {
        	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		Instant starttime= Instant.now();
		System.out.println(starttime.toString());
		
	//	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		Instant endtime= Instant.now();
		System.out.println(endtime.toString());
		
		Duration dura=Duration.between(starttime, endtime);
		System.out.println("pageloadtime -"+dura.getSeconds()+" seconds");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}
}
