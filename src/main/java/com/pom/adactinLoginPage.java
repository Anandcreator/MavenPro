package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adactinLoginPage {

	public static WebDriver driver;
	
	@FindBy (id ="username")
	private  WebElement Username;
	
	@FindBy (id="password")                                                  
	private WebElement Password;
	
	@FindBy (id="login")
	private WebElement lgbtn;
	
	public adactinLoginPage(WebDriver driver) {
	      this.driver = driver;   //this.driver means adactinLoginPage Driver, simply driver means CONSTRUCTOR driver, FOR RUNNER CLASS WE are Assigning here
	      PageFactory.initElements(driver, this);  //this indicates webelement like lgbtn,username,pwd.
	      
	}
	//get method for getting value from LOGINPAGE to pom(pageobjectManager-->)  and to pom(page object manager)

	
	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
   }