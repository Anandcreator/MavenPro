package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	
	public static WebDriver driver;
	
	@FindBy (id="location")
	private WebElement Location;
	@FindBy (id="room_nos")
	private WebElement roomno;
	@FindBy (id="adult_room")
	private WebElement adultroom;
	@FindBy (id = "Submit")
	private WebElement submitbutton;
	
	public SearchHotel( WebDriver driver) {
       this.driver =driver;
       PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
}
