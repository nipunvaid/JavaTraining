package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class SwitchTest {

	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exPath);
		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get(URL);
		FluentWait wait = new FluentWait(driver);
		wait.ignoring(NoSuchElementException.class);
		wait.pollingEvery(10, TimeUnit.MILLISECONDS);
		//Task 1
		String handle1 = driver.getWindowHandle();
		System.out.println("The value of handle is " + handle1);
		//Task 2
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
		Set handle2 = driver.getWindowHandles();
		System.out.println("The handles are " + handle2);
		//Task 3
		//Set handle3 = driver.getWindowHandles();
		for (String handle3 : driver.getWindowHandles()) {
		System.out.println(" Value is " +handle3);
		driver.switchTo().window(handle3);
		}
		driver.close();
		driver.switchTo().window(handle1);
		driver.close();
		System.out.println("Done");
	}
}
