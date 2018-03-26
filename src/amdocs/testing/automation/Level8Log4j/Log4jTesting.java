package amdocs.testing.automation.Level8Log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.jcl.Log4jLog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import amdocs.testing.automation.Level7ExcelRead.Constant;

public class Log4jTesting {

	public static WebDriver driver;
	
	public static Logger Log = Logger.getLogger(Log4jLog.class.getName());
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DOMConfigurator.configure("log4j.xml");
		
		String exPath = "C:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exPath);
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		Log.info("Driver was Started now at " +System.currentTimeMillis());
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("Driver was Maximized & Implicit Wait Added");
		
		driver.get(Constant.URL);
		Log.info("Application Launched");
		
		driver.findElement(By.id("email")).sendKeys("ernipunvaid@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("taken2014");
		driver.findElement(By.xpath("//input[@value=\"Log Masuk\"]")).click();
		Log.info("Username & Password Provided and Logged in to FB");
		
		System.out.println("Log in Done; Now logging out");
		
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.xpath("//Span[text()='Log Out']")).click();
		Log.info("Test Done; Now Logged Out");
		
		driver.close();
		Log.info("Driver Closed");

	}

}
