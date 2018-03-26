package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class SwitchTest2 {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exPath = "C:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exPath);
		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		@SuppressWarnings("rawtypes")
		FluentWait wait = new FluentWait(driver);
		wait.ignoring(NoSuchElementException.class);
		wait.pollingEvery(10, TimeUnit.MILLISECONDS);
		
		@SuppressWarnings("unused")
		String handle1 = driver.getWindowHandle();
		//Task 1
		driver.findElement(By.id("alert")).click();
		Alert myAlert = driver.switchTo().alert();
		myAlert.accept();
		wait.withTimeout(10, TimeUnit.SECONDS);
		System.out.println("Alert was accepted");
		
		wait.withTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.switchTo().window(handle1);
		System.out.println("Waited");
		driver.close();

	}

}
