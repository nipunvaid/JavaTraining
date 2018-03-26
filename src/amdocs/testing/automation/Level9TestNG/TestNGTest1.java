package amdocs.testing.automation.Level9TestNG;

import org.testng.annotations.Test;

import amdocs.testing.automation.Level7ExcelRead.Constant;


import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class TestNGTest1 {
	
	public static WebDriver driver;
	public static InternetExplorerDriver driver1;
	
  @Test
  @Parameters("browser")
  public void TestFlow(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
	  	driver.findElement(By.id("email")).sendKeys("ernipunvaid@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("taken2014");
		driver.findElement(By.xpath("//input[@value=\"Log Masuk\"]")).click();
		System.out.println("Login Done; Now Logging Out");
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.xpath("//Span[text()='Log Out']")).click();
		System.out.println("Logged Out");}
	  else if(browser.equalsIgnoreCase("ie")) {
		  	driver1.findElement(By.id("email")).sendKeys("ernipunvaid@gmail.com");
			driver1.findElement(By.id("pass")).sendKeys("taken2014");
			driver1.findElement(By.xpath("//input[@value=\"Log Masuk\"]")).click();
			System.out.println("Login Done; Now Logging Out");
			driver1.findElement(By.id("userNavigationLabel")).click();
			driver1.findElement(By.xpath("//Span[text()='Log Out']")).click();
			System.out.println("Logged Out");
	  }
	  
  }
  
  @SuppressWarnings("unused")
  @BeforeClass
  @Parameters("browser")
  
  public void beforeTest(String browser) {

	  if(browser.equalsIgnoreCase("chrome")) {
	  ChromeOptions option = new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  System.setProperty("webdriver.chrome.driver", Constant.exPath);
	  driver = new ChromeDriver(option);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(Constant.URL);
	  }
	  else if(browser.equalsIgnoreCase("ie")) {
		  String exPath = "C:\\IEdriver\\IEDriverServer.exe" ;
			System.setProperty("webdriver.ie.driver" , exPath);
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			//capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			//@SuppressWarnings("deprecation")
			InternetExplorerDriver driver1 = new InternetExplorerDriver();
			driver1.manage().window().maximize();
			 driver1.get(Constant.URL);
	  }
	  
	 
	  
  }

  @AfterClass
  public void afterTest() {
	  driver.close();
  }

}
