package com.testRunner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;

public class RunnerClass extends BaseClass {
		public static WebDriver driver ;
  
		public static void main(String[] args, String doubleclick, String movetoelement, String rightclick ) throws IOException {

			driver = browserLaunch("chrome");
			//driver.get("https://adactinhotelapp.com/");

			getUrl("https://adactinhotelapp.com/");
			WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
			inputValueElement(username, "jivita04");
			WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			inputValueElement(password, "123456");

			WebElement login = driver.findElement(By.xpath("//input[@class='login_button']"));
			clickOnElement(login);
			
		
			WebElement sel = driver.findElement(By.xpath("//select[@name='location']"));
			dropDown(sel, "index", "3");
			
			WebElement sel1 = driver.findElement(By.xpath("//select[@name='hotels']"));
			dropDown(sel1, "text", "Hotel Sunshine");
			
			//NavigateTo("https://www.facebook.com/");
			//NavigateBack();
			//NavigateForward();
			//NavigateRefresh();
			
			Screenshot("C:\\Users\\anand\\eclipse-workspace\\MavenProject\\Screenshots\\rec.png");
			
			
			
			
			
			
			Actionss(sel,rightclick, null);
			System.out.println("Done");
			driver.close();
		}
}
	
