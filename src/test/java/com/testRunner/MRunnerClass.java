package com.testRunner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;
import com.sdp.PageObjectManager;

public class MRunnerClass extends BaseClass {
	// null, we have to initialize here, else we get null pointer exception
	public static WebDriver driver = BaseClass.browserLaunch("Chrome");

	public static  PageObjectManager pom = new PageObjectManager(driver);
	
	public static void main(String[] args) throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		getUrl("https://adactinhotelapp.com/");
       
		
		String userdata = readData("C:\\Users\\anand\\Desktop\\datast.xlsx", 0, 5, 1);
		inputValueElement(pom.getInstanceLp().getUsername(),userdata );
		
		String passdata = readData("C:\\Users\\anand\\Desktop\\datast.xlsx", 0, 5, 2);
		inputValueElement(pom.getInstanceLp().getPassword(), passdata);
		
		clickOnElement(pom.getInstanceLp().getLgbtn());
		
		dropDown(pom.getInstanceSh().getLocation(),"value","Sydney");
		
		dropDown(pom.getInstanceSh().getRoomno(), "value", "1");
		
		dropDown(pom.getInstanceSh().getAdultroom(), "index", "3");
		
		clickOnElement(pom.getInstanceSh().getSubmitbutton());
		
		clickOnElement(pom.getInstanceSelectHotel().getRadiobutn());
		
		clickOnElement(pom.getInstanceSelectHotel().getContbutton());
		
		String firstn = readData("C:\\Users\\anand\\Desktop\\datast.xlsx", 0, 5, 1);
		inputValueElement(pom.getInstanceBookHotel().getFirstname(), firstn);
		
		String lastn = readData("C:\\Users\\anand\\Desktop\\datast.xlsx", 0, 5, 3);
		inputValueElement(pom.getInstanceBookHotel().getLastname(), lastn);
		
		String adrs = readData("C:\\Users\\anand\\Desktop\\datast.xlsx", 0, 5, 4);
		inputValueElement(pom.getInstanceBookHotel().getAdress(), adrs);
		
		String ccnum = readData("C:\\Users\\anand\\Desktop\\datast.xlsx", 0, 4, 5);
		inputValueElement(pom.getInstanceBookHotel().getCreditcardno(), ccnum);

		dropDown(pom.getInstanceBookHotel().getCreditcardtype(), "value", "AMEX");
		
		dropDown(pom.getInstanceBookHotel().getExpirymonth(), "value", "1");
		
		dropDown(pom.getInstanceBookHotel().getExpiryyear(), "text", "2026");
		
		String cvvdata = readData("C:\\Users\\anand\\Desktop\\datast.xlsx", 0, 5, 5);
		inputValueElement(pom.getInstanceBookHotel().getCvvnumber(),cvvdata );
		
		clickOnElement(pom.getInstanceBookHotel().getBooknowbtn());
		
		clickOnElement(pom.getInstanceBookingConfirm().getLogout());
		Screenshot("C:\\Users\\anand\\eclipse-workspace\\MavenProject\\Evidence\\proof.png");
		
		
	}

}








































