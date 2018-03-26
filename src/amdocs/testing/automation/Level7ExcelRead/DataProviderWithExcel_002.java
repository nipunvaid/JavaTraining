package amdocs.testing.automation.Level7ExcelRead;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class DataProviderWithExcel_002 {
	public static WebDriver driver;
	public String sTestCaseName;
	public int iTestCaseRow;
  @Test(dataProvider = "Authentication")
  public void TestFlow(String sUserName, String sPassword) {
	  	System.out.println(sUserName);
	  	System.out.println(sPassword);
	  	driver.get(Constant.URL);
	  	driver.findElement(By.id("email")).sendKeys(sUserName);
		driver.findElement(By.id("pass")).sendKeys(sPassword);
		driver.findElement(By.xpath("//input[@value=\"Log Masuk\"]")).click();
		System.out.println("Login Done; Now Logging Out");
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.xpath("//Span[text()='Log Out']")).click();
		System.out.println("Logged Out");
		Reporter.log("Test Passed");
  }

  @DataProvider(name = "Authentication")
  public Object[][] Authentication() throws Exception{
	  ExcelUtilAdvance.setExcelFile("C:\\Users\\nipunva\\eclipse-workspace\\Java Training\\src\\amdocs\\testing\\automation\\Level7ExcelRead\\TestData.xlsx","TestData");
	  sTestCaseName = this.toString();
	  System.out.println(sTestCaseName);
	  sTestCaseName = ExcelUtilAdvance.getTestCaseName(this.toString());
	  System.out.println("Now Its " + sTestCaseName);
	  iTestCaseRow = ExcelUtilAdvance.getRowContains(sTestCaseName, 0);
	  System.out.println(iTestCaseRow);
	  Object[][] testObjArray = ExcelUtilAdvance.getTableArray("C:\\Users\\nipunva\\eclipse-workspace\\Java Training\\src\\amdocs\\testing\\automation\\Level7ExcelRead\\TestData.xlsx", "TestData", iTestCaseRow);
    return (testObjArray);
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

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
