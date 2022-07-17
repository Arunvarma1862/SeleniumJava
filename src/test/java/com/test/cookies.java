package com.test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cookies {


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");



		                              // how to capture cookies from browser

		Set<Cookie> cookies=  driver.manage().getCookies();
		System.out.println( "size of cookies"+cookies.size());



		                              // how to print cookies from broswer

		for (Cookie cookie : cookies) {

			System.out.println(cookie.getName()+" : "+cookie.getValue());

		}

	                                   	// how to add cookies


		Cookie cook = new Cookie("arun", "1862");
		driver.manage().addCookie(cook);
		cookies=  driver.manage().getCookies();
		System.out.println( "size of cookies"+cookies.size());

		for (Cookie cookie : cookies) {

			System.out.println(cookie.getName()+" : "+cookie.getValue());

		}


		
		                               // how to delete specific cookie

		driver.manage().deleteCookie(cook);
		cookies=  driver.manage().getCookies();
		System.out.println( "size of cookies"+cookies.size());
	




		                            // how to delete specific cookie by name

		driver.manage().deleteCookieNamed("arun");
		cookies=	driver.manage().getCookies();
		System.out.println( "size of cookies"+cookies.size());





		                                        // delete all cookies

		driver.manage().deleteAllCookies();
		cookies=	driver.manage().getCookies();		
		System.out.println( "size of cookies"+cookies.size());




		Thread.sleep(2000);
		driver.quit();
	}

}
