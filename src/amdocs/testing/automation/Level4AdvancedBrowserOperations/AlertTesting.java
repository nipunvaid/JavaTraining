package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class AlertTesting {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String exPath = "C:\\\\chromedriver\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = "http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		@SuppressWarnings("rawtypes")
		FluentWait wait = new FluentWait(driver);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(NullPointerException.class);
		wait.pollingEvery(10, TimeUnit.MILLISECONDS);
		
		//SimpleAlert
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button")).click();
		Alert simpleAlert = driver.switchTo().alert();
		String simpleAlertText = simpleAlert.getText();
		System.out.println("The value of alert is" + simpleAlertText);
		simpleAlert.accept();
	
		//ConfirmationAlert
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[8]/button")).click();
		Alert confirmAlert = driver.switchTo().alert();
		String confirmAlertText = confirmAlert.getText();
		System.out.println("The value of conform alert is" +confirmAlertText);
		confirmAlert.accept();
		
		//PrompAlert
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[11]/button")).click();
		Alert popAlert = driver.switchTo().alert();
		String popAlertText = popAlert.getText();
		System.out.println("The value of pop Alert is " + popAlertText);
		popAlert.sendKeys("Accepting the Alert");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		popAlert.accept();
		
		driver.close();

	}

}
