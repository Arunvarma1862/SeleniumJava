package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DataBase {
	
	

	
	
	
    public static void main(String[] args) throws Exception {
    	
    	
//    	data
    	String user="Admin";
    	String pass="admin123";
    	
    	
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    driver.findElement(By.id("txtUsername")).sendKeys(user);
	    driver.findElement(By.id("txtPassword")).sendKeys(pass);
	    driver.findElement(By.id("btnLogin")).click();
	    try {
	    String demo=driver.findElement(By.id("welcome")).getText();
	    
	    if(demo.equals("Welcome SURYA")) {
		   System.out.println("confirmed");
	    }
	    else
	 	   System.out.println("  not confirmed");
	    }
	    catch(Exception e) {

	    System.out.println("wrong details");
	    }
	    
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myorange","root","Arunroot@123");
		Statement  stmt = con.createStatement();
	//	String s="insert into student values('Admin','admin123')";
	    String s="select user,pass from student";
		//	3,4. excute the query      and       store data in result set

		ResultSet rs=	stmt.executeQuery(s);
		while(rs.next())
		{
			String c =	rs.getString("user");
		
			String r =	rs.getString("pass");
			
			System.out.println(c+"     "+r+"    ");
		}

	//	stmt.execute(s);
		con.close();
		System.out.println("query excuted ");
		
		
		}
}
