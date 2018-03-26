package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exPath);
		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.findElement(By.id("timingAlert")).click();
		System.out.println("The timer is activated but not clicked");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Alert is loaded or timedout");
		myAlert.accept();
		System.out.println("Alert accepted");
		driver.close();
			}

}
