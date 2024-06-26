package com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.github.dockerjava.api.command.CopyFileFromContainerCmd;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	private static String value;

	// 1
	public static WebDriver browserLaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	// 2
	public static void Close() {
		driver.close();
	}

	// 3
	public static WebDriver quit() {
		driver.quit();
		return driver;
	}

	// 4  // Datadriven
	public  static void NavigateTo(String element) {
		driver.navigate().to(element);//TO URL
	}

	// 5
	public static void NavigateBack() {
		driver.navigate().back();
	}

	// 6
	public static void NavigateForward() {
		driver.navigate().forward();
	}

	// 7
	public static void NavigateRefresh() {
		driver.navigate().refresh();
	}

	// 8
	public static WebDriver getUrl(String Url) {
		driver.get(Url);
		return driver;
	}
	//9 // Alert
	public static WebDriver accept() {
		driver.switchTo().alert().accept();
		return driver;
	}
	//9
	public static WebDriver dismiss() {
		driver.switchTo().alert().accept();
		return driver;
	}
	// 10
	public static void Actionss(WebElement element, String type, WebElement target) {
		Actions a = new Actions(driver);
		if (type.equalsIgnoreCase("moveToelement")) {  //MOVING THE MOUSE TO REQ LOCATION
			a.moveToElement(element).perform();
		} else if (type.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(element).perform();
		} else if (type.equalsIgnoreCase("contextclick")) {
			a.contextClick(element).perform();
		} else if (type.equalsIgnoreCase("draganddrop")) {
			a.dragAndDrop(element, target).perform();
		}
	}
	// 11
	// Frames
	public static void frames(String frame1, int frameint, WebElement element) {

		if (frame1.equalsIgnoreCase("frame1")) {
			driver.switchTo().frame(element);
		} else if (frame1.equalsIgnoreCase("frame1")) {
			driver.switchTo().frame(frameint);
		} else if (frame1.equalsIgnoreCase("parentframe")) {
			driver.switchTo().parentFrame();
		} else if (frame1.equalsIgnoreCase("default")) {
			driver.switchTo().defaultContent();
		}
	}
	// 13
	public static WebDriver windowHandlee() {
		driver.getWindowHandle();
		return driver;
	}

	// 13
	public static WebDriver windowHandless() {
		driver.getWindowHandles();
		return driver;
	}

	// 14
	public static void dropDown(WebElement element,String type,  String Value) {
		Select s = new Select(element);

		if (type.equalsIgnoreCase("Value")) {
			s.selectByValue(Value);
		} else if (type.equalsIgnoreCase("index")) {
			int data = Integer.parseInt(Value);
			s.selectByIndex(data);
		} else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(Value);
		}
	}

	// 16
	public static void isEnabledd(WebElement element) {
		element.isEnabled();
	}

	// 17
	public static void isDisplayedd(WebElement element) {
		element.isDisplayed();
	}

	// 18
	public static void isSelectedd(WebElement element) {
		element.isSelected();
	}

	// 19
	// getoptions
	private void getoptionss(WebElement element) {
		Select s = new Select(element);
		s.getOptions();
	}

	// 20
	public static WebDriver getTitle() {
		driver.getTitle();
		return driver;
	}

	// 21
	public static WebDriver getcurrenturl() {
		driver.getCurrentUrl();
		return driver;
	}

	// 22
	public static WebDriver getText() {
		driver.switchTo().alert().getText();
		return driver;
	}

	// 23
	public static void getAttribute(WebElement element, String value) {
		element.getAttribute(value);
	}

	// 24
	public static void waitforpageload() {

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}
    //25 Screenshot
	public static void Screenshot(String path) throws IOException {
       TakesScreenshot ts = (TakesScreenshot)driver;
       File source = ts.getScreenshotAs(OutputType.FILE);
       File dest = new File(path);
       FileUtils.copyFile(source, dest);
	}
	
	// 26
	public static void scroll(String type) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("bottom")) {
			j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		} else if (type.equalsIgnoreCase("top")) {
			j.executeScript("window.scrollTo(0,0)");
		}
	}

	// 27
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	// 28
	// getFirstSelectedOptions
	public static void getFirstSelectedOptions(WebElement element) {
		Select s = new Select(element);
		s.getFirstSelectedOption();
	}
	//29
	public static void getAllSelectedOptions(WebElement element) {
		Select s = new Select(element);
		s.getAllSelectedOptions();
	}
	
	
	//30 // isMultiples

	public static void isMultiples(WebElement element) {
			Select s = new Select(element);
			s.isMultiple();
		}
	//31
	public static void clickOnElement(WebElement element) {
			element.click();
		}
		
    //32 // Radio Button
		

	public static void RadioButton(WebElement element) {
			element.click();
		}

   //33
	public static String readData(String path, int sheetIndex, int rowIndex, int cellIndex) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(sheetIndex);
		Row row = sheetAt.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			
			 value = cell.getStringCellValue();
			 
		} else if (cellType.equals(cellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();
			int data = (int) numericCellValue;
		      value = String.valueOf(data);
		}
		
		wb.close();
		return value ;
		// return Value;

	}
	// 34 Read All Data
	public static void excelreadAllData(String path, int sheetin) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(sheetin);
		Row row = sheetAt.getRow(sheetin);
		Cell cell = row.getCell(sheetin);
		CellType cellType = cell.getCellType();
	}

}
