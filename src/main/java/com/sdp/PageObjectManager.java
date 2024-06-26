package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.BookHotel;
import com.pom.BookingConfirm;
import com.pom.SearchHotel;
import com.pom.SelectHotel;
import com.pom.adactinLoginPage;

public class PageObjectManager {

	public static WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
       this.driver = driver;
	}
	public adactinLoginPage getInstanceLp() {
		adactinLoginPage lp =new adactinLoginPage(driver);
		return lp;
	}
	public SearchHotel getInstanceSh() {
		SearchHotel Sh = new SearchHotel(driver);
		return Sh;	
	}
	public SelectHotel getInstanceSelectHotel() {
		SelectHotel Selhotel = new SelectHotel(driver);
		return Selhotel;
	}
	public BookHotel getInstanceBookHotel() {
		BookHotel bookhotel = new BookHotel(driver);
		return bookhotel;
	}
	public BookingConfirm getInstanceBookingConfirm() {
		BookingConfirm bc= new BookingConfirm(driver);
		return bc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
