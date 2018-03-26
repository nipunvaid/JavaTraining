package amdocs.testing.automation.Level9TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import amdocs.testing.automation.Level7ExcelRead.Constant;

public class DataProviderTest {
	public static WebDriver driver;
	
@DataProvider(name="Authentication")	

public static Object[][] Authentication() {
	 
    return new Object[][] {{"ernipunvaid@gmail.com", "taken2014"}};

}
	
  @Test (dataProvider ="Authentication")
  public void Testflow(String sUsername, String sPassword) {
	  	System.out.println(sUsername);
	  	System.out.println(sPassword);
	  	driver.get(Constant.URL);
	  	driver.findElement(By.id("email")).sendKeys(sUsername);
		driver.findElement(By.id("pass")).sendKeys(sPassword);
		driver.findElement(By.xpath("//input[@value=\"Log Masuk\"]")).click();
		System.out.println("Login Done; Now Logging Out");
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.xpath("//Span[text()='Log Out']")).click();
		System.out.println("Logged Out");
		driver.quit();
		Reporter.log("Test Passed");
  }
  
  @BeforeTest
  public void beforeTest() {
  ChromeOptions option = new ChromeOptions();
  option.addArguments("--disable-notifications");
  System.setProperty("webdriver.chrome.driver", Constant.exPath);
  driver = new ChromeDriver(option);
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}
