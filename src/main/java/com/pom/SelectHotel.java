package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

	public static WebDriver driver;
	@FindBy (id="radiobutton_2")
	private WebElement radiobutn;
	
	@FindBy(id="continue")
	private WebElement contbutton;
	
	public SelectHotel(WebDriver driver) {
       this.driver =driver;
       PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobutn() {
		return radiobutn;
	}

	public WebElement getContbutton() {
		return contbutton;
	}
	
	
}
