package amdocs.testing.automation.Level9TestNG;

import org.testng.annotations.Test;

import amdocs.testing.automation.Level7ExcelRead.Constant;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.jcl.Log4jLog;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class TestNGLog4jTest2 {
	
	public static WebDriver driver;
	
	public static Logger Log = Logger.getLogger(Log4jLog.class.getName());
	
  @Test
  public void Testflow() {
		driver.findElement(By.id("email")).sendKeys("ernipunvaid@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("taken2014");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		Log.info("Username & Password Provided and Logged in to FB");
		
		System.out.println("Log in Done; Now logging out");
		
		WebElement Navigation = driver.findElement(By.id("userNavigationLabel"));
		Assert.assertTrue(Navigation.isDisplayed());
		Reporter.log("Test Case Executed");
		System.out.println("Awesome");
		
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.xpath("//Span[text()='Log Out']")).click();
		Log.info("Test Done; Now Logged Out");
		Reporter.log("Test Case Passed");
  }
  @BeforeMethod
  public void beforeMethod() {
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
		Reporter.log("Application Launched");
  }

  @AfterMethod
  public void afterMethod() {
		driver.close();
		Log.info("Driver Closed");
		Reporter.log("Finish");
  }

}
