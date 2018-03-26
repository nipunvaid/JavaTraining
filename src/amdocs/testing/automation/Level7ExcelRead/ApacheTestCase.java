package amdocs.testing.automation.Level7ExcelRead;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ApacheTestCase {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", exPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "TestData");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);
		
		
		WebElement UserName = driver.findElement(By.id("email"));
		WebElement PassWord = driver.findElement(By.id("pass"));
		WebElement LogInButton = driver.findElement(By.xpath("//input[@value=\"Log Masuk\"]"));
		String sUserName = null;
		String sPassWord = null;		
		try {
			sUserName = ExcelUtils.getCellData(1, 1);
			sPassWord = ExcelUtils.getCellData(1, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("UserName is " +sUserName);
		System.out.println("Password is " +sPassWord);
			
		UserName.sendKeys(sUserName);
		PassWord.sendKeys(sPassWord);
		LogInButton.click();
		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(30000);
		//waitForAlert(driver);
		waitForSearch(driver);
		
		WebElement Navigation = driver.findElement(By.id("userNavigationLabel"));
		Navigation.click();
		
		
		//Actions action = new Actions(driver);
		//action.moveToElement(Navigation).build().perform();
		//Navigation.click();
		WebElement LogOutButton = driver.findElement(By.xpath("//Span[text()='Log Out']"));
		LogOutButton.click();
		ExcelUtils.setCellData("Awesome", 1, 3);
		System.out.println("Logged Out");		
		driver.close();
	}
	static void waitForAlert(WebDriver driver) throws InterruptedException
	{
	   System.out.println("I am here");
		int i=0;
	   while(i++<15)
	   {
	        try
	        {
	        	 
	            Alert alert = driver.switchTo().alert();
	            alert.accept();
	            System.out.println("I am here Now");
	           break;
	        }
	        catch(NoAlertPresentException e)
	        {
	          Thread.sleep(2000);
	          continue;
	        }
	   }
	}
	
	public static void waitForSearch(WebDriver driver) throws InterruptedException
	{
		int j=0;
		while(j++<5)
		{
try {
			//WebElement wSearch = driver.findElement(By.name("q"));
			if(driver.findElement(By.name("q")).isDisplayed()) {
				System.out.println("Login Success; Now logging out");
			}
			  break;
			}
catch (NoSuchElementException e) {
	Thread.sleep(1000);
    continue;
}
		}
	}
}
