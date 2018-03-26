package amdocs.testing.automation.Level9TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import amdocs.testing.automation.Level7ExcelRead.Constant;

public class ParaMeterTest {

	  public static WebDriver driver;
	  public String sUsername,sPassword;
	  
	@Test
	@Parameters({"sUsername","sPassword"})
  	public void TestFlow(String sUsername , String sPassword){
	  
	  ChromeOptions option = new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  System.setProperty("webdriver.chrome.driver", Constant.exPath);
	  driver = new ChromeDriver(option);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(Constant.URL);
	  
	  	driver.findElement(By.id("email")).sendKeys("ernipunvaid@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("taken2014");
		driver.findElement(By.xpath("//input[@value=\"Log Masuk\"]")).click();
		System.out.println("Login Done; Now Logging Out");
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.xpath("//Span[text()='Log Out']")).click();
		System.out.println("Logged Out");
}
	  
  }
