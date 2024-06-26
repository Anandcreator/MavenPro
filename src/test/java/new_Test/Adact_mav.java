package new_Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adact_mav {

	public static WebDriver driver;

	public static void login() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anand\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Jivita04");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");

		driver.findElement(By.xpath("//input[@class='login_button']")).click();

	}

	private static void Details() {
		WebElement sel = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(sel);
		s.selectByIndex(3);

		WebElement sel1 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(sel1);
		s1.selectByVisibleText("Hotel Sunshine");

		WebElement sel2 = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(sel2);
		s2.selectByIndex(2);

		WebElement sel3 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(sel3);
		s3.selectByIndex(4);
		
		driver.findElement(By.xpath("//input[@class='date_pick']")).sendKeys("15/04/2024");
		
		driver.findElement(By.xpath("(//input[@class='date_pick'])[2]")).sendKeys("17/04/2024");
		
		
		
		

		WebElement sel4 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(sel4);
		s4.selectByIndex(2);

		WebElement sel5 = driver.findElement(By.xpath("//select[@name='child_room']"));

		Select s5 = new Select(sel5);
		s5.selectByIndex(2);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	private static void submit() {
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();

		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	private static void details_submit() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)"); // SCROLL DOWN

		driver.findElement(By.xpath("//INPUT[@name='first_name']")).sendKeys("Jivita");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("J");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("NO.88 Dubai Cross Street Dubai-4327");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("6754327654379432");

		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select cc = new Select(cctype);
		cc.selectByIndex(2);

		WebElement ccmo = driver.findElement(By.xpath("//select[@class='select_combobox2']"));
		Select ccm = new Select(ccmo);
		ccm.selectByIndex(12);

		WebElement ccye = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select ccy = new Select(ccye);
		ccy.selectByIndex(8);

		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("456");

		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(8000);

	}

	private static void confirm_page() throws IOException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");

		driver.findElement(By.xpath("//input[@type='button'][2]")).click();

		// TakesScreenshot

		JavascriptExecutor jsee = (JavascriptExecutor) driver;
		jsee.executeScript("window.scrollBy(0,10000)");
	}

	private static void logout() {

		driver.findElement(By.xpath("//input[@name='logout']")).click();

		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
	}

	private static void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\anand\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\picture.png");
		FileUtils.copyFile(source, dest);
		System.out.println("Maven is Done..");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		login();
		Details();
		submit();
		details_submit();
		confirm_page();
		logout();
		screenshot();

	}

}
